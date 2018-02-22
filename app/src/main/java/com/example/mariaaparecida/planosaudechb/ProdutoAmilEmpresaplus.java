package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoAmilEmpresaplus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoamilempresaplus);
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

//falta coparticipacao

    public void chamaAmil200plus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,221,222);
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaAmil400plus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,223,224);
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil500plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,225,231);
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil700plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,226,232);
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }
}
