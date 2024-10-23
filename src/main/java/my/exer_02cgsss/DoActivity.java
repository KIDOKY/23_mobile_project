package my.exer_02cgsss;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GymEquipmentAdapter adapter;
    private List<GymEquipment> equipmentList;
    private TextView textViewTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do);

        textViewTitle = findViewById(R.id.textViewTitle);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        equipmentList = new ArrayList<>();
        //가슴 운동
        equipmentList.add(new GymEquipment("인클라인 벤치 프레스<가슴>", "사용할 수 있음"));
        equipmentList.add(new GymEquipment("펙덱플라이 머신<가슴>", "사용할 수 있음"));
        equipmentList.add(new GymEquipment("케이블 크로스오버<가슴>", "사용할 수 있음"));
        equipmentList.add(new GymEquipment("체스트 프레스<가슴>", "사용할 수 있음"));
        //등 운동
        equipmentList.add(new GymEquipment("풀 업<등>", "사용할 수 있음"));
        equipmentList.add(new GymEquipment("렛풀 다운<등>", "사용할 수 있음"));
        equipmentList.add(new GymEquipment("롱 풀<등>", "사용할 수 있음"));
        equipmentList.add(new GymEquipment("케이블 풀 오버<등>", "사용할 수 있음"));
        //하체 운동
        equipmentList.add(new GymEquipment("레그 프레스<다리>", "사용할 수 있음"));
        equipmentList.add(new GymEquipment("레그 컬<다리>", "사용할 수 있음"));
        //어깨 운동
        equipmentList.add(new GymEquipment("숄더 프레스<어깨>", "사용할 수 있음"));
        // 기타 기구 추가

        adapter = new GymEquipmentAdapter(this, equipmentList);
        recyclerView.setAdapter(adapter);
    }
}
