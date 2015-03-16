package com.example.usuario.storm.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.example.usuario.storm.R;
import com.example.usuario.storm.adapters.DayAdapter;
import com.example.usuario.storm.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter dayAdapter = new DayAdapter(this, mDays);
    }


}
