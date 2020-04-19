package com.unisc.exercicio_aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cliqueBotao1(View view) {
        Intent intent = new Intent(this, telatimes.class);
        startActivity(intent);
    }

    public void cliqueBotao2(View view) {
    }

    public void cliqueBotao3(View view) {
    }
}
