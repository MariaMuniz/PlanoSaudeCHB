package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 08/01/2018.
 */

public class ProdutoVitallisind extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtovitallis);
    }

    public void chamaOuroVitallis(View v) {
        Singleton.getInstance().setIdProduto(290);
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPrataVitallis(View v) {
        Singleton.getInstance().setIdProduto(291);
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaOuroFamiliarVitallis(View v) {
        Singleton.getInstance().setIdProduto(292);
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPrataFamiliarVitallis(View v) {
        Singleton.getInstance().setIdProduto(293);
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }
}

