package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 16/01/2018.
 */

public class ProdutoQualicorpAmilPremium extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpamil);
    }



    public void chamaAmil400Premium(View v) {
        Intent it = new Intent(ProdutoQualicorpAmilPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil500Premium(View v) {
        Intent it = new Intent(ProdutoQualicorpAmilPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil700Premium(View v) {
        Intent it = new Intent(ProdutoQualicorpAmilPremium.this, Tabelagrid.class);
        startActivity(it);
    }
}
