package com.unisc.exercicio_aula6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.sql.Array;

public class ExercicioSpinner extends AppCompatActivity {
    private Spinner spinner;
    String[] cores = {"Azul","Verde","Vermelho","Amarelo"};
    int[] cores2 = {Color.BLUE, Color.GREEN,Color.RED,Color.YELLOW};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_spinner);
        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(new MyAdapter(this,R.layout.spinner_item,cores));
    }

    public void voltarClique(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    class MyAdapter extends ArrayAdapter {
        public MyAdapter(Context ctx, int resources, String[] array) {
            super(ctx,resources,array);
        }

        private View getCustomView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.spinner_item,parent,false);
            TextView tv = layout.findViewById(R.id.texto);
            tv.setText(cores[position]);
            layout.setBackgroundColor(cores2[position]);
            return  layout;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }
    }
}
