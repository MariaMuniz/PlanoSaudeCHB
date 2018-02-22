package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 13/01/2018.
 */

public class AdesaoBemBeneficios extends Activity {

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adesaobembeneficios);
    }


    public void chamaProdutoBemBeneficios(View v) {
        Singleton.getInstance().setIdOperadora(58);
        Intent it = new Intent(AdesaoBemBeneficios.this, ProdutoBemBeneficios.class);
        startActivity(it);
    }
}
