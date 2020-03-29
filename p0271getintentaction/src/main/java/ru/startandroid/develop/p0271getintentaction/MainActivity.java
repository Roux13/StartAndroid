package ru.startandroid.develop.p0271getintentaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTime = findViewById(R.id.btnTime);
        Button btnDate = findViewById(R.id.btnDate);
        btnTime.setOnClickListener(this::onClick);
        btnDate.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        int id = view.getId();
        Intent intent = new Intent();
        if (id == R.id.btnTime) {
            intent = new Intent("ru.startandroid.intent.action.showtime");
        }
        if (id == R.id.btnDate) {
            intent = new Intent("ru.startandroid.intent.action.showdate");
        }
        startActivity(intent);
    }
}
