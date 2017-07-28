package com.yangon.timeagomm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.yangon.library.TimeAgoFormat;
import com.yangon.library.TimeAgoMM;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            String time = TimeAgoMM.format("31-08-2013 10:20:56", TimeAgoFormat.DDMYYYY_HHMMSS);
            Log.e("TIME_AGO", TimeAgoMM.format("31-08-2013 10:20:56", TimeAgoFormat.DDMYYYY_HHMMSS));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
