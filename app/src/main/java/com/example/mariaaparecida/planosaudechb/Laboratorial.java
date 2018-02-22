package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 06/01/2018.
 */

public class Laboratorial extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laboratorial);
    }

    public void chamaPremiumAmbulatorialIndividual(View v) {
        Singleton.getInstance().setIdOperadora(15);
        Intent it = new Intent(Laboratorial.this, ProdutoPremiumAmbInd.class);
        startActivity(it);
    }
    public void chamaPremiumEmpresarialAmb(View v) {
        Singleton.getInstance().setIdOperadora(14);
        Intent it = new Intent(Laboratorial.this, ProdutoAmbulatorialEmpresarialPremium.class);
        startActivity(it);
    }

    public void chamaProdutoAmbulatorialGood(View v) {
        Singleton.getInstance().setIdOperadora(16);
        Intent it = new Intent(Laboratorial.this, ProdutoAmbulatorialGood.class);
        startActivity(it);
    }

    public void chamaProdutoAmbPromed(View v) {
        Singleton.getInstance().setIdOperadora(16);
        Intent it = new Intent(Laboratorial.this, ProdutoAmbPromed.class);
        startActivity(it);
    }
}
