package com.example.dhome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class ResetPass extends AppCompatActivity {
    Button resetConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Remove title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_reset_pass);

        resetConnection = (Button) findViewById(R.id.button_Reset_id);
        resetConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityMain();
            }
        });
    }

    public void openActivityMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}