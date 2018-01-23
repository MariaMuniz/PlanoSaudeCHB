package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 16/01/2018.
 */

public class ProdutoqualicorpBradescoPremium extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpbradescopremium);
    }

    public void chamaTopNacionalPremium(View v) {
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaNacionalFlexPremium(View v) {
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus1Premium(View v) {
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaTopPlus2Premium(View v) {
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus3Premium(View v) {
        Intent it = new Intent(ProdutoqualicorpBradescoPremium.this, Tabelagrid.class);
        startActivity(it);
    }
}
