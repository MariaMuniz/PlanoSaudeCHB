package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoVitallisEmpresa extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtovitallisempresa);
    }

    public void onRadioButtonClicked(View view) {
        String acomodacao = "";
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.apt:
                if (checked){
                    Singleton.getInstance().setAcomodacao("Apartamento");
                }

                break;
            case R.id.enf:
                if (checked){
                    Singleton.getInstance().setAcomodacao("Enfermaria");;
                }

                break;
        }
    }
    public void chamaGlobalVitallisEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,214,212);
        Intent it = new Intent(ProdutoVitallisEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPlatinaVitallisEmpesa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,213,211);
        Intent it = new Intent(ProdutoVitallisEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
}
