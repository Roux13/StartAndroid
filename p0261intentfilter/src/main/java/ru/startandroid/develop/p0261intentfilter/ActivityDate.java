package ru.startandroid.develop.p0261intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ActivityDate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        TextView tvDate = findViewById(R.id.tvDate);
        DateFormat formatter = SimpleDateFormat.getDateInstance();
        Date date = new Date(System.currentTimeMillis());
        tvDate.setText(formatter.format(date));
    }
}
