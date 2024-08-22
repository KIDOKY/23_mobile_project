package my.exer_02cgsss;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private ListView messageListView;
    private EditText messageEditText;
    private Button sendButton;
    private List<String> messages;
    private ArrayAdapter<String> adapter;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        messageListView = findViewById(R.id.messageListView);
        messageEditText = findViewById(R.id.messageEditText);
        sendButton = findViewById(R.id.sendButton);

        sharedPreferences = getSharedPreferences("ChatPrefs", MODE_PRIVATE);

        messages = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, messages);
        messageListView.setAdapter(adapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 저장된 채팅 불러오기
        loadMessages();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // 채팅 저장하기
        saveMessages();
    }

    private void sendMessage() {
        String message = messageEditText.getText().toString();
        if (!message.isEmpty()) {
            messages.add(message);
            adapter.notifyDataSetChanged();
            messageEditText.setText("");

            // 저장 기능 추가
            saveMessages();
        }
    }

    private void saveMessages() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("messageCount", messages.size());
        for (int i = 0; i < messages.size(); i++) {
            editor.putString("message_" + i, messages.get(i));
        }
        editor.apply();
    }

    private void loadMessages() {
        messages.clear();
        int messageCount = sharedPreferences.getInt("messageCount", 0);
        for (int i = 0; i < messageCount; i++) {
            String message = sharedPreferences.getString("message_" + i, null);
            if (message != null) {
                messages.add(message);
            }
        }
        adapter.notifyDataSetChanged();
    }
}