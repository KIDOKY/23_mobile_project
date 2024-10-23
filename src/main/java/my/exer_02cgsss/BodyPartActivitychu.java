package my.exer_02cgsss;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BodyPartActivitychu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodychu_part);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BodyPartActivitychu.this,
                        "등 기구 사용 현황을 보여드리겠습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BodyPartActivitychu.this,
                        "어깨 기구 사용 현황을 보여드리겠습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BodyPartActivitychu.this,
                        "가슴 기구 사용 현황을 보여드리겠습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BodyPartActivitychu.this,
                        "하체 기구 사용 현황을 보여드리겠습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BodyPartActivitychu.this, "유산소 기구 사용 현황을 보여드리겠습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BodyPartActivitychu.this, "그 외 기구 사용 현황을 보여드리겠습니다.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}