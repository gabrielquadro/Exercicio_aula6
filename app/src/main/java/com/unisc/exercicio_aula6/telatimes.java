package com.unisc.exercicio_aula6;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class telatimes extends ListActivity {
    String[] de = {"imagem","nomeTime","pontos"};
    int[] para = {R.id.imgView,R.id.nomeTime,R.id.pontos};
    List<Map<String, Object>> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telatimes);

        lista = new ArrayList<>();

        String[] clubes = {"Palmeiras", "Flamengo", "Atlético Mineiro", "Corinthians", "Santos", "Grêmio", "Ponte Preta", "Fluminense", "Atlético Paranaense", "Chapecoense", "Botafogo", "São Paulo", "Sport", "Cruzeiro", "Vitória", "Coritiba", "Internacional", "Figueirense", "Santa Cruz", "América Mineiro"};
        int[] pontos = {43, 40, 39, 37, 36, 36, 34, 34, 33, 30, 29, 28, 27, 26, 26, 26, 24, 24, 19, 13};
        int[] img = {R.drawable.pal, R.drawable.fla, R.drawable.cam, R.drawable.cor, R.drawable.san, R.drawable.gre, R.drawable.pon, R.drawable.flu, R.drawable.cap, R.drawable.cha, R.drawable.bot, R.drawable.sao, R.drawable.spt, R.drawable.cru, R.drawable.vit, R.drawable.cfc, R.drawable.inter, R.drawable.fig, R.drawable.sta, R.drawable.ame};

        for(int i = 0 ;i < pontos.length; i++){
            Map mpa = new HashMap<>();
            mpa.put("imagem",img[i]);
            mpa.put("nomeTime",clubes[i]);
            mpa.put("pontos",pontos[i]);
            lista.add(mpa);
        }

        SimpleAdapter adpter = new MeuAdptador(this, lista, R.layout.line_item,de,para);
        ListView listView = getListView();
        listView.setAdapter(adpter);
    }

    public void voltarClique2(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
