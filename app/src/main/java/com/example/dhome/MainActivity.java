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

        // Supprimer la barre de titre
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Mettre en plein écran
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Masquer la barre d'action
        getSupportActionBar().hide();

        // Définir le layout de l'activité
        setContentView(R.layout.activity_main);


        // Initialiser le bouton de connexion et définir un écouteur d'événements
        buttonConnect = (Button) findViewById(R.id.button_Connection_id);
        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });

        // Initialiser le texte "Forgot Your Password" et définir un écouteur d'événements
        forgotPass = (TextView) findViewById(R.id.text_FYP_id);
        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReset();
            }
        });
    }

    // Méthode pour ouvrir l'activité "Home"
    public void openHome(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    // Méthode pour ouvrir l'activité "ResetPass"
    public void openReset(){
        Intent intent = new Intent(this, ResetPass.class);
        startActivity(intent);
    }

}