package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 23/01/2018.
 */

public class ProdutoVitallisAlcare extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtovitallisalcare);
    }

    public void chamaEssencilaptAlcare(View v) {
        Singleton.getInstance().setIdProduto(25);
        Intent it = new Intent(ProdutoVitallisAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEssencialenfAlcare(View v) {
        Singleton.getInstance().setIdProduto(24);
        Intent it = new Intent(ProdutoVitallisAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
}
