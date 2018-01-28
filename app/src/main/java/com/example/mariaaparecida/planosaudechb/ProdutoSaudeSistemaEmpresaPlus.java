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

public class ProdutoSaudeSistemaEmpresaPlus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosaudesistemaempresaplus);
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


    public void chamaEssencialPrimeEmpresaplus(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaClassico180Empresaplus(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaClassico200Empresaplus(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaMasterEmpresaplus(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

}
