package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutogoodlifeEmpresa extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosgoodlifeempresas);
    }



    public void chamaMultiGood(View v) {
        Singleton.getInstance().setIdProduto(162);
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUniqueGood(View v) {
        Singleton.getInstance().setIdProduto(161);
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUniqueGoodlife(View v) {
        Singleton.getInstance().setIdProduto(159);
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamasSemobstetricia(View v) {
        Singleton.getInstance().setIdProduto(160);
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
}
