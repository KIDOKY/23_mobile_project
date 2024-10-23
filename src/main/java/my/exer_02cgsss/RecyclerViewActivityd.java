package my.exer_02cgsss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivityd extends AppCompatActivity {
    private RecyclerView recyclerView1;
    private ArrayList<String> selectedItems;
    private RecyclerViewAdapterd adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_viewd);

        recyclerView1 = findViewById(R.id.recyclerView1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));

        selectedItems = getIntent().getStringArrayListExtra("selectedItems");

        adapter = new RecyclerViewAdapterd(selectedItems);
        recyclerView1.setAdapter(adapter);
    }
    public void onBackPressed() {
        super.onBackPressed();
        finish(); // 액티비티를 종료하여 항목이 유지되지 않도록 함
    }
}