package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 09/01/2018.
 */

public class ProdutoBemBeneficios extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtobembeneficios);
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
    public void chamaBemBeneficiosSaudeMulti(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,26,27);
        Intent it = new Intent(ProdutoBemBeneficios.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaBemBeneficiosConsaude(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,28,29);
        Intent it = new Intent(ProdutoBemBeneficios.this, Tabelagrid.class);
        startActivity(it);
    }
}
