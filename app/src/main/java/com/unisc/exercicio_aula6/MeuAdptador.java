package com.unisc.exercicio_aula6;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

class MeuAdptador extends SimpleAdapter {
    public MeuAdptador(Context ctx, List<Map<String, Object>> lista, int line_item, String[] de, int[] para) {
        super(ctx,lista,line_item,de,para);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v =  super.getView(position, convertView, parent);
        TextView nomeTimes = v.findViewById(R.id.nomeTime);
        TextView pontosTimes = v.findViewById(R.id.pontos);


        if(position % 2 == 0){
            v.setBackgroundColor(Color.GREEN);
            nomeTimes.setTextColor(Color.BLACK);
            pontosTimes.setTextColor(Color.BLACK);

        }else{
            v.setBackgroundColor(Color.YELLOW);
            nomeTimes.setTextColor(Color.WHITE);
            pontosTimes.setTextColor(Color.WHITE);
        }

        return v;
    }

}
