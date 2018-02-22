package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 23/01/2018.
 */

public class ProdutoQualicorpSulamericaPremium extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpsulamericapremium);
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


    public void chamaExatoSulamericaPremium(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,106,107);
        Intent it = new Intent(ProdutoQualicorpSulamericaPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaEspecialcemSulamericaPremium(View v) {
        Singleton.getInstance().setIdProduto(108);
        Intent it = new Intent(ProdutoQualicorpSulamericaPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEspecialcem1SulamericaPremium(View v) {
        Singleton.getInstance().setIdProduto(109);
        Intent it = new Intent(ProdutoQualicorpSulamericaPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEspecialcem2SulamericaPremium(View v) {
        Singleton.getInstance().setIdProduto(110);
        Intent it = new Intent(ProdutoQualicorpSulamericaPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaExecutivo1SulamericaPremium(View v) {
        Singleton.getInstance().setIdProduto(111);
        Intent it = new Intent(ProdutoQualicorpSulamericaPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaExecutivo2SulamericaPremium(View v) {
        Singleton.getInstance().setIdProduto(112);
        Intent it = new Intent(ProdutoQualicorpSulamericaPremium.this, Tabelagrid.class);
        startActivity(it);
    }
}
