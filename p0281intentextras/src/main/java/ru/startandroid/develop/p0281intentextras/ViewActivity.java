package ru.startandroid.develop.p0281intentextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Intent intent = this.getIntent();
        String fName = intent.getStringExtra("fname");
        String lName = intent.getStringExtra("lname");
        TextView tvView = findViewById(R.id.tvView);
        tvView.setText("Your name is " + fName + " " + lName);
    }
}
