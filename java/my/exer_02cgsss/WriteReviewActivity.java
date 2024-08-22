package my.exer_02cgsss;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WriteReviewActivity extends AppCompatActivity {
    private EditText editTextReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);

        editTextReview = findViewById(R.id.editTextReview);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String review = editTextReview.getText().toString();
                if (!TextUtils.isEmpty(review)) {
                    ReviewListActivity reviewListActivity = (ReviewListActivity) getParent();
                    reviewListActivity.addReview(review);
                    Toast.makeText(WriteReviewActivity.this, "후기 작성이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(WriteReviewActivity.this, "후기를 작성해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}