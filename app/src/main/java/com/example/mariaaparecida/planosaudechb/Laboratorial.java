package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 06/01/2018.
 */

public class Laboratorial extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laboratorial);
    }

    public void chamaPremiumAmb(View v) {
        Intent it = new Intent(Laboratorial.this, ProdutoAmbulatorialPremium.class);
        startActivity(it);
    }

    public void chamaGoodlifeAmb(View v) {
        Intent it = new Intent(Laboratorial.this, ProdutoAmbulatorialGood.class);
        startActivity(it);
    }
}