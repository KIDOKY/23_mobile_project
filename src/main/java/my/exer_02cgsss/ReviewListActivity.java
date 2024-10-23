package my.exer_02cgsss;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReviewListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ReviewAdapter reviewAdapter;
    private List<String> reviewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        reviewList = new ArrayList<>();

        reviewAdapter = new ReviewAdapter(reviewList);
        recyclerView.setAdapter(reviewAdapter);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void addReview(String review) {
        reviewList.add(review);
        reviewAdapter.notifyDataSetChanged();
    }
}