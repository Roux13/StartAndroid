package ru.startandroid.develop.p0261intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnTime;
    private Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTime = findViewById(R.id.btnTime);
        btnDate = findViewById(R.id.btnDate);
        btnTime.setOnClickListener(this::onClick);
        btnDate.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        int id = view.getId();
        Intent intent = null;
        if (id == btnTime.getId()) {
            intent = new Intent("ru.startandroid.intent.action.showtime");
        }
        if (id == btnDate.getId()) {
            intent = new Intent("ru.startandroid.intent.action.showdate");
        }
        startActivity(intent);
    }
}
