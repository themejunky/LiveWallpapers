package com.livewallpapers;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;

import com.livewallpapers.lwp.ManagerFallingHeartsLwp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        new ManagerFallingHeartsLwp((Activity)this).set();
    }
}
