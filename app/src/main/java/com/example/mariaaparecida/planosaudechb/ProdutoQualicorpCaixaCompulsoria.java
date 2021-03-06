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

public class ProdutoQualicorpCaixaCompulsoria
        extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpcaixacompulsorio);
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

    public void chamaFundamentalCompulsorio(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,85,86);
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaVitalCompulsorio(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,87,88);
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCompletoCompulsorio(View v) {
        Singleton.getInstance().setIdProduto(90);
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCompletomaisCompulsorio(View v) {
        Singleton.getInstance().setIdProduto(91);
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaProntoCompulsorio(View v) {
        Singleton.getInstance().setIdProduto(89);
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }
}
