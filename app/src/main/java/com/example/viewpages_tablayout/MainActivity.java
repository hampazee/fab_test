package com.example.viewpages_tablayout;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.loacion_btn);
        fab.setOnClickListener((v -> {
            Intent testIntent = new Intent();
            testIntent.setAction(Intent.ACTION_SEND);
            testIntent.putExtra(Intent.EXTRA_TEXT,"Go to work");
            testIntent.setType("text/plain");


        }));





    }

}