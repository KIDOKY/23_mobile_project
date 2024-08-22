package my.exer_02cgsss;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Bmr2Activity extends AppCompatActivity {

    private EditText editTextBMR;
    private Button buttonCalculate, nextButton2;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr2);

        editTextBMR = findViewById(R.id.editTextBMR);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);
        nextButton2 = findViewById(R.id.nextButton2);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCalories();
            }
        });

        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });
    }

    private void calculateCalories() {
        String bmrText = editTextBMR.getText().toString();

        if (bmrText.isEmpty()) {
            textViewResult.setText("빈칸을 입력하세요.");
            return;
        }

        double bmr = Double.parseDouble(bmrText);
        double result = bmr * 1.2; // 20%를 추가하여 계산

        textViewResult.setText("유지 칼로리: " + result);
    }

    private void openNextActivity() {
        // 다음 액티비티로 이동하는 코드 작성
        Intent intent = new Intent(Bmr2Activity.this, Bmr3Activity.class);
        startActivity(intent);
    }
}
