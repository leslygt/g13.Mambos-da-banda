package com.example.mambosdabanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Loja extends AppCompatActivity {

    private ImageView lojaIcon;
    private TextView lojaTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);
        lojaIcon = (ImageView) findViewById(R.id.lojaIconImageView);
        lojaTitle = (TextView) findViewById(R.id.lojaTitleTextView);

        Intent intent = getIntent();

        com.example.mambosdabanda.model.Loja loja =
                (com.example.mambosdabanda.model.Loja) intent.getSerializableExtra("loja");

        Glide.with(getBaseContext()).load(loja.getImgUrl()).into(lojaIcon);
        lojaTitle.setText(loja.getNome());

    }
}