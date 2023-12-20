package com.example.tp1.Vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tp1.R;

public class RetourActivity2 extends AppCompatActivity {
    private Button tvReponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retour2);
        tvReponse = (Button) findViewById(R.id.btnReturn);

        tvReponse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RetourActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
