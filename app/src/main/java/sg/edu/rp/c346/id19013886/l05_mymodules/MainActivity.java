package sg.edu.rp.c346.id19013886.l05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Event Handling Step 1
    TextView tvC346;
    TextView tvC349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Event Handling Step 2
        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        // Event Handling Step 3
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", "2021");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E62E");
                startActivity(intent);
            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C349");
                intent.putExtra("name", "iPad Programming");
                intent.putExtra("year", "2021");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E62H");
                startActivity(intent);
            }
        });

    }
}