package my.exer_02cgsss;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bmr3Activity extends AppCompatActivity {

    private EditText editTextMaintenanceCalories;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr3);

        editTextMaintenanceCalories = findViewById(R.id.editTextMaintenanceCalories);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCalories();
            }
        });
    }

    private void calculateCalories() {
        String maintenanceCaloriesText = editTextMaintenanceCalories.getText().toString();

        if (maintenanceCaloriesText.isEmpty()) {
            textViewResult.setText("빈칸을 입력해주세요.");
            return;
        }

        double maintenanceCalories = Double.parseDouble(maintenanceCaloriesText);
        double increaseCalories = maintenanceCalories * 1.2; // Calculate 20% more calories
        double decreaseCalories = maintenanceCalories * 0.8; // Calculate 20% fewer calories

        double increaseCarbohydrates = increaseCalories * 0.5; // 50% of increase calories
        double increaseProtein = increaseCalories * 0.3; // 30% of increase calories
        double increaseFat = increaseCalories * 0.2; // 20% of increase calories

        double decreaseCarbohydrates = decreaseCalories * 0.5; // 50% of decrease calories
        double decreaseProtein = decreaseCalories * 0.3; // 30% of decrease calories
        double decreaseFat = decreaseCalories * 0.2; // 20% of decrease calories

        String resultText = "증량 칼로리: " + increaseCalories
                + "\n증량 탄수화물: " + increaseCarbohydrates
                + "\n증량 단백질: " + increaseProtein
                + "\n증량 지방: " + increaseFat
                + "\n감량 칼로리: " + decreaseCalories
                + "\n감량 탄수화물: " + decreaseCarbohydrates
                + "\n감량 단백질: " + decreaseProtein
                + "\n감량 지방: " + decreaseFat;

        textViewResult.setText(resultText);
    }
}
