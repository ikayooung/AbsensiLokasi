package com.aplikasi.absensilokasi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ui extends AppCompatActivity {

    private TextView textClock, textDate;
    private Runnable r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        textClock = findViewById(R.id.clock);
        textDate = findViewById(R.id.date);

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                @SuppressLint("SimpleDateFormat")
                DateFormat clockFormat = new SimpleDateFormat("HH:mm");

                @SuppressLint("SimpleDateFormat")
                DateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy");

                textClock.setText(clockFormat.format(new Date()));
                textDate.setText(dateFormat.format(new Date()));

                //interval
                handler.postDelayed(this, 1000);
            }
        });

    }

}