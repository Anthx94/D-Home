package com.example.dhome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class comfort extends Activity {
    Button bHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comfort);

        bHome = (Button) findViewById(R.id.button_Comfort_HOME_id);
        bHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goHome();
            }
        });
    }

    public void goHome(){
        Intent intentHome = new Intent(this, home.class);
        startActivity(intentHome);
    }
}
