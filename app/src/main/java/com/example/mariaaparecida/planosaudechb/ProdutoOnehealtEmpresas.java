package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoOnehealtEmpresas extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosonehealtempresas);
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



    public void chamaLincxlt4(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,164,170);
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaLincxlt3(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,163,169);
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt3(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,166,172);
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaBlackt4(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,167,173);
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaBlackt5(View v) {
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,168,174);

        startActivity(it);
    }

    public void chamaBlackt2(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,165,171);
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }
}