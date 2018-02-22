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

public class ProdutoqualicorpBradescoPremium extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpbradescopremium);
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

    public void chamaTopNacionalBradescoPremium(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,48,49);
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaNacionalFlexBradescoPremium(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,46,47);
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus1Premium(View v) {
        Singleton.getInstance().setIdProduto(50);
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaTopPlus2Premium(View v) {
        Singleton.getInstance().setIdProduto(51);
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus3Premium(View v) {
        Singleton.getInstance().setIdProduto(52);
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }
}
