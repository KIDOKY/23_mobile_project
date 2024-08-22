package my.exer_02cgsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivityd extends AppCompatActivity {

    private Button bt1, bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maind);
        bt1=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);

        bt1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivityd.this, Activity2d.class);
            startActivity(intent);
        Toast.makeText(getApplicationContext(),"원하는 유산소 운동을 골라보세요",Toast.LENGTH_SHORT).show();
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivityd.this,Activity3d.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"오늘 운동할 부위를 정해주세요",Toast.LENGTH_SHORT).show();
    }
         });

    }


}