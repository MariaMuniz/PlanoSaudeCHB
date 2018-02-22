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

public class ProdutoQualicorpBradescoSupremo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpbradescosupremo);
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

    public void chamaPerfil1Supremo(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,69,70);
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaTopNacionalSupremo(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,73,74);
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaNacionalFlexSupremo(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,71,72);
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopNPlus1Supremo(View v) {
        Singleton.getInstance().setIdProduto(75);
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaTopNPlus2Supremo(View v) {
        Singleton.getInstance().setIdProduto(76);
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopNPlus3Supremo(View v) {
        Singleton.getInstance().setIdProduto(77);
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
}
