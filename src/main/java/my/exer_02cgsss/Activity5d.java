package my.exer_02cgsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity5d extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> itemList;
    private ArrayList<String> selectedItems;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5d);

        listView = findViewById(R.id.listView1);
        itemList = new ArrayList<>();
        itemList.add("데드리프트");
        itemList.add("랫풀다운");
        itemList.add("덤벨로우");
        itemList.add("바벨로우");
        itemList.add("시티드 케이블로우");
        itemList.add("T-bar로우");
        itemList.add("케이블 풀오버");
        itemList.add("풀업");
        itemList.add("원 암 덤벨로우");
        itemList.add("루마니안 데드리프트");
        selectedItems = new ArrayList<>();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = itemList.get(position);
                selectedItems.add(selectedItem);
            }
        });
    }

    public void onViewSelectedItemsClick1(View view) {
        Intent intent = new Intent(Activity5d.this, RecyclerViewActivityd.class);
        intent.putStringArrayListExtra("selectedItems", selectedItems);
        startActivity(intent);
    }

    public void back1(View view) {
        Intent intent = new Intent(this,Activity3d.class);

        startActivity(intent);
    }

}
