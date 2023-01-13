package com.example.dhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonConnect;
    TextView forgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);


        buttonConnect = (Button) findViewById(R.id.button_Connection_id);
        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });

        forgotPass = (TextView) findViewById(R.id.text_FYP_id);
        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReset();
            }
        });
    }

    public void openHome(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    public void openReset(){
        Intent intent = new Intent(this, ResetPass.class);
        startActivity(intent);
    }

}