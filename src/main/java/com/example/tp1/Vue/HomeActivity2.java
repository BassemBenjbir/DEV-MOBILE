package com.example.tp1.Vue;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp1.R;

public class HomeActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        // Initialisation des composants EditText et du bouton
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.btnconsulter);

        // Ajout d'un écouteur de clic au bouton
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupérer les valeurs saisies
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Appeler la méthode createUser du contrôleur
                loginController.createUser(username, password, HomeActivity.this);
            }
        });
    }
}
