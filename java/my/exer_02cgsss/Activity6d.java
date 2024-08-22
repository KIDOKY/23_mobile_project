package my.exer_02cgsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity6d extends AppCompatActivity {


    private ListView listView;
    private ArrayList<String> itemList;
    private ArrayList<String> selectedItems;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6d);

        listView = findViewById(R.id.listView2);
        itemList = new ArrayList<>();
        itemList.add("덤벨 숄더프레스");
        itemList.add("오버헤드프레스");
        itemList.add("덤벨 프론트레이즈");
        itemList.add("사이드 레터럴레이즈");
        itemList.add("벤트오버 레터럴레이즈");
        itemList.add("비하이드 넥프레스");
        itemList.add("업라이트 로우");
        itemList.add("케이블프론트레이즈");
        itemList.add("리버스 팩덱플라이");

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

    public void onViewSelectedItemsClick2(View view) {
        Intent intent = new Intent(Activity6d.this, RecyclerViewActivityd.class);
        intent.putStringArrayListExtra("selectedItems", selectedItems);
        startActivity(intent);
    }

    public void back2(View view) {
        Intent intent = new Intent(this,Activity3d.class);

        startActivity(intent);
    }

}

