package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 16/01/2018.
 */

public class ProdutoQualicorpAmilSupremo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpamilsupremo);
    }

    public void chamaAmil500Supremo(View v) {
        Intent it = new Intent(ProdutoQualicorpAmilSupremo.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaAmil400Supremo(View v) {
        Intent it = new Intent(ProdutoQualicorpAmilSupremo.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaAmil700Supremo(View v) {
        Intent it = new Intent(ProdutoQualicorpAmilSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
}
