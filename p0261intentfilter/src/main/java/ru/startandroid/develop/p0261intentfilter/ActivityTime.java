package ru.startandroid.develop.p0261intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class ActivityTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        TextView tvTime = findViewById(R.id.tvTime);
        DateFormat simpleDateFormat = SimpleDateFormat.getTimeInstance();
        Date date = new Date(System.currentTimeMillis());
        tvTime.setText(simpleDateFormat.format(date));
    }
}
