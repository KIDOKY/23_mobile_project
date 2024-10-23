package my.exer_02cgsss;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import my.exer_02cgsss.ReviewAdapter;
import my.exer_02cgsss.WriteReviewActivity;

public class ReviewActivity extends AppCompatActivity {
    private List<String> reviewList;
    private ReviewAdapter reviewAdapter;
    private TextView noReviewTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        reviewList = new ArrayList<>();

        RecyclerView reviewRecyclerView = findViewById(R.id.reviewRecyclerView);
        reviewRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        reviewAdapter = new ReviewAdapter(reviewList);
        reviewRecyclerView.setAdapter(reviewAdapter);

        noReviewTextView = findViewById(R.id.noReviewTextView);

        Button writeReviewButton = findViewById(R.id.writeReviewButton);
        writeReviewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReviewActivity.this, WriteReviewActivity.class);
                startActivityForResult(intent, 1);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {
            String review = data.getStringExtra("review");
            if (review != null) {
                reviewList.add(review);
                reviewAdapter.notifyDataSetChanged();
                noReviewTextView.setVisibility(View.GONE);
            }
        }
    }
}