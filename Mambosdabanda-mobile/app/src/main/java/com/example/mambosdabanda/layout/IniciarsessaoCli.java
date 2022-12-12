package com.example.mambosdabanda.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mambosdabanda.R;
import com.example.mambosdabanda.RegistarCli;

public class IniciarsessaoCli extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciarsessao_cli);

        button = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity = new Intent(getBaseContext(), RegistarCli.class);
                startActivity(activity);
            }
        });
    }
}