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
    Button bLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Supprimer la barre de titre
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Mettre en plein écran
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Masquer la barre d'action
        getSupportActionBar().hide();

        // Définir le layout de l'activité
        setContentView(R.layout.home);


        // Initialiser le bouton "Comfort" et définir un écouteur d'événements
        bComfort = (Button) findViewById(R.id.button_Comfort_id);
        bComfort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openComfort();
            }
        });

        // Initialiser le bouton "Weather" et définir un écouteur d'événements
        bWeather = (Button) findViewById(R.id.button_Weather_id);
        bWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeather();
            }
        });

        // Initialiser le bouton "Security" et définir un écouteur d'événements
        bSecurity = (Button) findViewById(R.id.button_Security_id);
        bSecurity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecurity();
            }
        });

        // Initialiser le bouton "Logout" et définir un écouteur d'événements
        bLogout = (Button) findViewById(R.id.button_Logout_id);
        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { logout(); }
        });
    }

    // Méthode pour ouvrir l'activité "Comfort"
    public void openComfort(){
        Intent intentComfort = new Intent(this, comfort.class);
        startActivity(intentComfort);
    }

    // Méthode pour ouvrir l'activité "Weather"
    public void openWeather(){
        Intent intentWeather = new Intent(this, weather.class);
        startActivity(intentWeather);
    }

    // Méthode pour ouvrir l'activité "Security"
    public void openSecurity(){
        Intent intentSecurity = new Intent(this, security.class);
        startActivity(intentSecurity);
    }

    // Méthode pour effectuer la déconnexion
    public void logout(){
        Intent intentLogout = new Intent(this, MainActivity.class);
        startActivity(intentLogout);
    }
}