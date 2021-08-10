package com.example.viewpages_tablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Locale;

public class MainActivity2 extends AppCompatActivity {

    int hour,minute,hour1,minute1;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_picker);

        btn1 = findViewById(R.id.former_btn);
        btn2 = findViewById(R.id.latter_btn);


    }

    public void picktime1(View view){
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selecthour, int selectminute) {
                hour = selecthour;
                minute = selectminute;
                btn1.setText(String.format(Locale.getDefault(),"%02d : %02d",hour,minute));
            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,onTimeSetListener,hour,minute,true);

        timePickerDialog.setTitle("select time");
        timePickerDialog.show();


    }

    public void picktime2(View view){
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selecthour, int selectminute) {
                hour1 = selecthour;
                minute1 = selectminute;
                btn2.setText(String.format(Locale.getDefault(),"%02d : %02d",hour1,minute1));
            }
        };
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,onTimeSetListener,hour1,minute1,true);

        timePickerDialog.setTitle("select time");
        timePickerDialog.show();


    }
}