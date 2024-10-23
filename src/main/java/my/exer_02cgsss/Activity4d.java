package my.exer_02cgsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity4d  extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> itemList;
    private ArrayList<String> selectedItems;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4d);

        listView = findViewById(R.id.listView);
        itemList = new ArrayList<>();
        itemList.add("벤치프레스");
        itemList.add("덤벨프레스");
        itemList.add("푸쉬업");
        itemList.add("체스트 프레스 머신");
        itemList.add("인클라인 벤치프레스");
        itemList.add("딥스");
        itemList.add("인클라인 체스트 프레스 머신");
        itemList.add("백덱플라이");
        itemList.add("케이블 크로스오버");
        itemList.add("딥스");
        itemList.add("덤벨 플라이");
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

    public void onViewSelectedItemsClick(View view) {
        Intent intent = new Intent(Activity4d.this, RecyclerViewActivityd.class);
        intent.putStringArrayListExtra("selectedItems", selectedItems);
        startActivity(intent);
        selectedItems.clear();
    }


    public void back(View view) {
        Intent intent = new Intent(this,Activity3d.class);

        startActivity(intent);
    }

}



