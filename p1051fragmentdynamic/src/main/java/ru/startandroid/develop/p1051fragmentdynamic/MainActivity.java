package ru.startandroid.develop.p1051fragmentdynamic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    Fragment1 frag1;
    Fragment2 frag2;
    FragmentTransaction fTrans;
    CheckBox chbStack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag1 = new Fragment1();
        frag2 = new Fragment2();
        chbStack = findViewById(R.id.chbStack);
    }

    public void onClick(View view) {
//        fTrans = getFragmentManager().beginTransaction();
//        int id = view.getId();
//        switch (id) {
//            case R.id.btnAdd:
//                fTrans.add(R.id.frgmCont, frag1, "Fragment1");
//                break;
//        }
    }
}
