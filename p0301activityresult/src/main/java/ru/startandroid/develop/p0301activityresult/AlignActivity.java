package ru.startandroid.develop.p0301activityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class AlignActivity extends AppCompatActivity {

    public static final String ALIGN_KEY = "alignment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_align);
        Button btnLeft = findViewById(R.id.btnLeft);
        Button btnCenter = findViewById(R.id.btnCenter);
        Button btnRight = findViewById(R.id.btnRight);
        btnLeft.setOnClickListener(this::onClick);
        btnCenter.setOnClickListener(this::onClick);
        btnRight.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        int id = view.getId();
        int align = 0;
        switch (id) {
            case R.id.btnLeft:
                align = Gravity.LEFT;
                break;
            case R.id.btnCenter:
                align = Gravity.CENTER;
                break;
            case R.id.btnRight:
                align = Gravity.RIGHT;
        }
        Intent intent = new Intent();
        intent.putExtra(ALIGN_KEY, align);
        setResult(RESULT_OK, intent);
        finish();
    }
}
