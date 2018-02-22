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

public class ProdutoQualicorpSulamericaSupremo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpsulamericasupremo);
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


    public void chamaExatoSulamericaSupremo(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,122,123);
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEspecialcemSulamericaSupremo(View v) {
        Singleton.getInstance().setIdProduto(124);
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEspecialcem1SulamericaSupremo(View v) {
        Singleton.getInstance().setIdProduto(125);
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaEspecialcem2SulamericaSupremo(View v) {
        Singleton.getInstance().setIdProduto(126);
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaExecutivo1SulamericaSupremo(View v) {
        Singleton.getInstance().setIdProduto(127);
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaExecutivo2SulamericaSupremo(View v) {
        Singleton.getInstance().setIdProduto(128);
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }

}
