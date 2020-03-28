package ru.startandroid.p0211twoactivity;

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
        Button btnActTwo = findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Activity_Two.class);
        startActivity(intent);
    }
}
