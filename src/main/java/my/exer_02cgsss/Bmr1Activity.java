package my.exer_02cgsss;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

public class Bmr1Activity extends AppCompatActivity {

    private EditText weightInput;
    private EditText heightInput;
    private EditText ageInput;
    private Button calculateButton;
    private TextView resultText;

    private Button next_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr1);

        weightInput = findViewById(R.id.weight_input);
        heightInput = findViewById(R.id.height_input);
        ageInput = findViewById(R.id.age_input);
        calculateButton = findViewById(R.id.calculate_button);
        resultText = findViewById(R.id.result_text);
        next_Button = findViewById(R.id.next_button);


        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weightStr = weightInput.getText().toString();
                String heightStr = heightInput.getText().toString();
                String ageStr = ageInput.getText().toString();

                if (!weightStr.isEmpty() && !heightStr.isEmpty() && !ageStr.isEmpty()) {
                    double weight = Double.parseDouble(weightStr);
                    double height = Double.parseDouble(heightStr);
                    int age = Integer.parseInt(ageStr);

                    double bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
                    resultText.setText("당신의 기초 대사량은 " + bmr + " 칼로리입니다.");
                } else {
                    resultText.setText("빈칸을 채워주세요.");
                }
            }
        });
        next_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bmr1Activity.this, Bmr2Activity.class);
                startActivity(intent);
            }
        });
    }
}