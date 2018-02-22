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

public class ProdutoPromedEmpresa extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtopromedempresa);
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


    public void chamaConfortPromedEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,185,186);
        //Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,179,180);
        Intent it = new Intent(ProdutoPromedEmpresa.this, TabelaPromed.class);
        startActivity(it);
    }
    public void chamaSelectPromedEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,181,182);
       // Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,175,176);
        Intent it = new Intent(ProdutoPromedEmpresa.this, TabelaPromed.class);
        startActivity(it);
    }
    public void chamaLifePromedEmpresa(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,183,184);
       // Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,177,178);
        Intent it = new Intent(ProdutoPromedEmpresa.this, TabelaPromed.class);
        startActivity(it);
    }

}
