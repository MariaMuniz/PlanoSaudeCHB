package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;


public class Fragment05 extends Fragment implements View.OnClickListener {
    public ArrayAdapter<String> LTRadapter2;
    public Spinner spinner2;
    public Activity activity;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        activity = this.getActivity();
        getActivity().setTitle("Simulador");
        final View v = inflater.inflate(R.layout.fragment_fragment05, container, false);


        ImageView mButton = (ImageView) v.findViewById(R.id.individual);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.variasempresas);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.laboratorial);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.adesao);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.odonto);
        mButton.setOnClickListener(this);

        mButton = (ImageView) v.findViewById(R.id.informacoes);
        mButton.setOnClickListener(this);


        return v;

    }

    @Override
    public void onClick(View v) {
        Intent it;

        switch (v.getId()) {
            case R.id.individual:
                it = new Intent(activity, Individual.class);
                break;
            case R.id.laboratorial:
                it = new Intent(activity, Laboratorial.class);
                break;
            case R.id.variasempresas:
                it = new Intent(activity, Variasempresas.class);
                break;
            case R.id.adesao:
                it = new Intent(activity, Adesao.class);
                break;
            case R.id.odonto:
                it = new Intent(activity, Odontologico.class);
                break;
            case R.id.informacoes:
               it = new Intent(activity,Informacoes.class);
               break;
            default:
                it = new Intent(activity, Individual.class);
                break;
        }

        startActivity(it);
    }
}
