package my.exer_02cgsss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivitychu extends AppCompatActivity {
    private int currentCount = 0;
    private TextView currentCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitychu_main);

        currentCountTextView = findViewById(R.id.currentCountTextView);

        Button enterButton = findViewById(R.id.enterButton);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentCount++;
                currentCountTextView.setText("현재 인원: " + currentCount);
            }
        });

        Button exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentCount > 0) {
                    currentCount--;
                }
                currentCountTextView.setText("현재 인원: " + currentCount);
            }
        });

        Button viewCountsButton = findViewById(R.id.viewCountsButton);
        viewCountsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivitychu.this,
                        "각 부위별 인원 현황을 보여드리겠습니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivitychu.this, DoActivity.class);
                startActivity(intent);
            }
        });


        Button exerciseButton = findViewById(R.id.exerciseButton);
        exerciseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivitychu.this,
                        "추천 드리는 운동을 보여드리겠습니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivitychu.this, MainActivityd.class);
                startActivity(intent);
            }
        });

        Button dietButton = findViewById(R.id.dietButton);
        dietButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivitychu.this,
                        "회원분의 칼로리를 계산해드리겠습니다!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivitychu.this, Bmr1Activity.class);
                startActivity(intent);
                // 추천 식단을 보여주는 코드를 추가하세요
            }
        });

        Button reviewButton = findViewById(R.id.reviewButton2);
        reviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivitychu.this, "후기로 다른 회원 분들과 소통해 보세요!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivitychu.this, ChatActivity.class);
                startActivity(intent);
            }
        });
    }
}