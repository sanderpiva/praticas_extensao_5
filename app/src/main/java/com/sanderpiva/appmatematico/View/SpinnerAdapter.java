package com.sanderpiva.appmatematico.View;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.sanderpiva.appmatematico.Model.AreaQuadrado.Aquadrado;
import com.sanderpiva.appmatematico.Model.Eq1Grau.EquacaoPrimeiroGrau;
import com.sanderpiva.appmatematico.Model.Eq2Grau.EquacaoSegundoGrau;
import com.sanderpiva.appmatematico.Model.PA.PA;
import com.sanderpiva.appmatematico.Model.PG.PG;
import com.sanderpiva.appmatematico.Model.PerimetroQuadrado.PerimetroQuadrado;
import com.sanderpiva.appmatematico.Model.Porcentagem.Porcentagem;
import com.sanderpiva.appmatematico.Model.Proporcao.Proporcao;
import com.sanderpiva.appmatematico.Model.SenoCossenoTangente.SenoCossenoTangente;
import com.sanderpiva.appmatematico.Model.TeoremaPitagoras.Pitagoras;

public class SpinnerAdapter extends ArrayAdapter<String> implements AdapterView.OnItemSelectedListener {

    private Context mContext;
    private String[] mOptions;

    public SpinnerAdapter(Context context, String[] options) {
        super(context, android.R.layout.simple_spinner_item, options);
        mContext = context;
        mOptions = options;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        TextView text = view.findViewById(android.R.id.text1);
        text.setTextColor(Color.BLACK);
        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                break;

            case 1:
                Intent intent1 = new Intent(mContext, Pitagoras.class);
                mContext.startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(mContext, Aquadrado.class);
                mContext.startActivity(intent2);
                break;

            case 3:
                Intent intent3 = new Intent(mContext, SenoCossenoTangente.class);
                mContext.startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(mContext, PerimetroQuadrado.class);
                mContext.startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(mContext, PA.class);
                mContext.startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(mContext, PG.class);
                mContext.startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(mContext, Porcentagem.class);
                mContext.startActivity(intent7);
                break;
            case 8:
                Intent intent8 = new Intent(mContext, Proporcao.class);
                mContext.startActivity(intent8);
                break;
            case 9:
                Intent intent9 = new Intent(mContext, EquacaoPrimeiroGrau.class);
                mContext.startActivity(intent9);
                break;
            case 10:
                Intent intent10 = new Intent(mContext, EquacaoSegundoGrau.class);
                mContext.startActivity(intent10);
                break;



            // adicione mais casos para cada tela que deseja abrir
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // não faz nada
    }
}
