package com.example.dhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button bComfort;
    Button bWeather;
    Button bSecurity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.home);

        bComfort = (Button) findViewById(R.id.button_Comfort_id);
        bComfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openComfort();
            }
        });

        bWeather = (Button) findViewById(R.id.button_Weather_id);
        bWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeather();
            }
        });

        bSecurity = (Button) findViewById(R.id.button_Security_id);
        bSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecurity();
            }
        });
    }

    public void openComfort(){
        Intent intentComfort = new Intent(this, comfort.class);
        startActivity(intentComfort);
    }

    public void openWeather(){
        Intent intentWeather = new Intent(this, weather.class);
        startActivity(intentWeather);
    }

    public void openSecurity(){
        Intent intentSecurity = new Intent(this, security.class);
        startActivity(intentSecurity);
    }
}