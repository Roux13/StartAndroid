package ru.startandroid.develop.p0301activityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorActivity extends AppCompatActivity {

    public static final String COLOR_KEY = "color";

    private Button btnRed;
    private Button btnGreen;
    private Button btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnBlue = findViewById(R.id.btnBlue);
        btnRed.setOnClickListener(this::onClick);
        btnGreen.setOnClickListener(this::onClick);
        btnBlue.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        int id = view.getId();
        int color = 0;
        switch (id) {
            case R.id.btnRed:
                color = Color.RED;
                break;
            case R.id.btnGreen:
                color = Color.GREEN;
                break;
            case R.id.btnBlue:
                color = Color.BLUE;
        }
        Intent intent = new Intent();
        intent.putExtra(COLOR_KEY, color);
        setResult(RESULT_OK, intent);
        finish();
    }
}
