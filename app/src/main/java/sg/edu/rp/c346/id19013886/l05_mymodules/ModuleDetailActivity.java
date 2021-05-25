package sg.edu.rp.c346.id19013886.l05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    // Event Handling Step 1
    TextView tvAnswer;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        // Event Handling Step 2
        btnReturn = findViewById(R.id.buttonReturn);
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String code = "Module Code: " + intentReceived.getStringExtra("code");
        String name = "Module Name: " + intentReceived.getStringExtra("name");
        String year = "Academic Year: " + intentReceived.getStringExtra("year");
        String semester = "Semester: " + intentReceived.getStringExtra("semester");
        String credit = "Module Credit: " + intentReceived.getStringExtra("credit");
        String venue = "Venue: " + intentReceived.getStringExtra("venue");

        String output = String.format("%s \n\n%s \n\n%s \n\n%s \n\n%s \n\n%s \n\n",
                code, name, year, semester, credit, venue);

        if (code.contentEquals("C346")) {
            tvAnswer.setText(output);
        } else {
            tvAnswer.setText(output);
        }

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}