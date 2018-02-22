package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 07/01/2018.
 */

public class AdesaoAlcare extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adesaoalcare);
    }
    public void chamaBradescoAlcare(View v) {
        Singleton.getInstance().setIdOperadora(4);
        Intent it = new Intent(AdesaoAlcare.this, ProdutoBradescoAlcare.class);
        startActivity(it);
    }
    public void chamaVivamedAlcare(View v) {
        Singleton.getInstance().setIdOperadora(57);
        Intent it = new Intent(AdesaoAlcare.this, ProdutoVivamedAlcare.class);
        startActivity(it);
    }
    public void chamaSampAlcare(View v) {
        Singleton.getInstance().setIdOperadora(56);
        Intent it = new Intent(AdesaoAlcare.this, ProdutoSampAlcare.class);
        startActivity(it);
    }

    public void chamaVitallisAlcare(View v) {
        Singleton.getInstance().setIdOperadora(5);
        Intent it = new Intent(AdesaoAlcare.this, ProdutoVitallisAlcare.class);
        startActivity(it);
    }
}
