package my.exer_02cgsss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2d extends AppCompatActivity {

    Button ba1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2d);
        ba1=findViewById(R.id.button7);
        ba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity2d.this, MainActivityd.class);
                startActivity(intent);

            }
        });
    }

    public void setFrag1(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();

        ft.replace(R.id.frame_container, new Fragment1(), "one");
        ft.commitAllowingStateLoss();
    }

    public void setFrag2(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();

        ft.replace(R.id.frame_container, new Fragment2(), "one");
        ft.commitAllowingStateLoss();
    }
    public void setFrag3(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();

        ft.replace(R.id.frame_container, new Fragment3(), "one");
        ft.commitAllowingStateLoss();
    }
    public void setFrag4(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();

        ft.replace(R.id.frame_container, new Fragment4(), "one");
        ft.commitAllowingStateLoss();
    }

}