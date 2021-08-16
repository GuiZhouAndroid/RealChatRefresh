package com.zs.itking.realchatrefresh.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zs.itking.realchatrefresh.R;
import com.zs.itking.realchatrefresh.fragment.InstantPracticeFragment;

public class InstantPracticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_instant);
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_show,new InstantPracticeFragment()).commit();
    }
}