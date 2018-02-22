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

public class ProdutoUnimedEmpresaPlus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtouminedempresaplus);
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

    public void chamaUnipartFlex30plus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,273,274);
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnipartFlex50plus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,275,276);
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUnifacilFlex30plus(View v) {
        Singleton.getInstance().setIdProduto(269);
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnifacilFlex50plus(View v) {
        Singleton.getInstance().setIdProduto(270);
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaUnimaxplus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,271,272);
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPlenoUnimedEmpresaplus(View v) {
        Singleton.getInstance().escolheIdApartamentoOuIdEnfermaria(this,268,267);
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

}
