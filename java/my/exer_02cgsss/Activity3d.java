package my.exer_02cgsss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3d extends AppCompatActivity {
    Button bb1, ba1, ba2, ba3, ba4, ba5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3d);
        bb1 = findViewById(R.id.button20);
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity3d.this, MainActivityd.class);
                startActivity(intent);

            }
        });
        ba1 = findViewById(R.id.button8);
        ba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3d.this, Activity4d.class);
                startActivity(intent);


            }
        });
        ba3 = findViewById(R.id.button9);
        ba3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3d.this, Activity5d.class);
                startActivity(intent);


            }
        });
        ba4 = findViewById(R.id.button10);
        ba4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3d.this, Activity6d.class);
                startActivity(intent);


            }
        });
        ba5 = findViewById(R.id.button11);
        ba5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3d.this, Activity7d.class);
                startActivity(intent);


            }
        });



    }


    }



