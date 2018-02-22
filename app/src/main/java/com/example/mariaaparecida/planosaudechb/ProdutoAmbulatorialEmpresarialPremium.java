package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 10/02/2018.
 */

public class ProdutoAmbulatorialEmpresarialPremium extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoambulatorialpremium);
    }


    public void chamaOuroPremiumEmpresa(View v) {
        Singleton.getInstance().setIdProduto(133);
        Intent it = new Intent(ProdutoAmbulatorialEmpresarialPremium.this, Tabelagrid.class);
        startActivity(it);
    }


     public void chamaPrataPremiumempresa(View v) {
        Singleton.getInstance().setIdProduto(132);
        Intent it = new Intent(ProdutoAmbulatorialEmpresarialPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPlatinaPremiumAmb(View v) {
        Singleton.getInstance().setIdProduto(131);
        Intent it = new Intent(ProdutoAmbulatorialEmpresarialPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBronzePremiumAmb(View v) {
        Singleton.getInstance().setIdProduto(130);
        Intent it = new Intent(ProdutoAmbulatorialEmpresarialPremium.this, Tabelagrid.class);
        startActivity(it);
    }
}







