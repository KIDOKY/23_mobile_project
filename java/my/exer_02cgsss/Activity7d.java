package my.exer_02cgsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity7d extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> itemList;
    private ArrayList<String> selectedItems;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7d);

        listView = findViewById(R.id.listView3);
        itemList = new ArrayList<>();
        itemList.add("바벨 스쿼트");
        itemList.add("레그 익스텐션");
        itemList.add("레그 컬");
        itemList.add("레그 프레스");
        itemList.add("런지");
        itemList.add("카프레이즈");
        itemList.add("핵스쿼트");
        itemList.add("바벨 힙 스러스트");
        itemList.add("바벨 브릿지");

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

    public void onViewSelectedItemsClick3(View view) {
        Intent intent = new Intent(Activity7d.this, RecyclerViewActivityd.class);
        intent.putStringArrayListExtra("selectedItems", selectedItems);
        startActivity(intent);
    }

    public void back3(View view) {
        Intent intent = new Intent(this,Activity3d.class);

        startActivity(intent);
    }

}

