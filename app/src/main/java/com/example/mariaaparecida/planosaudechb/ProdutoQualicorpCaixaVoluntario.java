package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 16/01/2018.
 */

public class ProdutoQualicorpCaixaVoluntario extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpcaixavoluntario);
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

    public void onButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.coper:
                if (checked) {
                    Singleton.getInstance().setCooparticipacao(true);

                }

                break;
            case R.id.semcoper:
                if (checked) {
                    Singleton.getInstance().setCooparticipacao(false);
                }
                break;
        }
    }

    public void chamaFundamentalVoluntario(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,99,100);
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaVitalVoluntario(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,101,102);
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCompletoVoluntario(View v) {
        Singleton.getInstance().setIdProduto(104);
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCompletomaisVoluntario(View v) {
        Singleton.getInstance().setIdProduto(105);
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaProntoVoluntario(View v) {
        Singleton.getInstance().setIdProduto(103);
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }
}
