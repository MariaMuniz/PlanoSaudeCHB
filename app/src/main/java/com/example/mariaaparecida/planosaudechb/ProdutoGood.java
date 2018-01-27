package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 09/01/2018.
 */

public class ProdutoGood extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtogood);
    }



    public void chamaOuroGood(View v) {
        Singleton.getInstance().setIdProduto(277);
        Intent it = new Intent(ProdutoGood.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPrataGood(View v) {
        Singleton.getInstance().setIdProduto(278);
        Intent it = new Intent(ProdutoGood.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPlatinaGood(View v) {
        Singleton.getInstance().setIdProduto(280);
        Intent it = new Intent(ProdutoGood.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaBronzeGood(View v) {
        Singleton.getInstance().setIdProduto(279);
        Intent it = new Intent(ProdutoGood.this, Tabelagrid.class);
        startActivity(it);
    }
}
