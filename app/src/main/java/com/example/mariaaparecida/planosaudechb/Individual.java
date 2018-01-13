package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 06/01/2018.
 */

public class Individual extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);
    }

    public void chamaProdutoVitallis(View v) {
        Intent it = new Intent(Individual.this, ProdutoVitallisind.class);
        startActivity(it);
    }

    public void chamaProdutoGood(View v) {
        Intent it = new Intent(Individual.this, ProdutoGood.class);
        startActivity(it);
    }


    public void chamaProdutoUnimed(View v) {
        Intent it = new Intent(Individual.this, ProdutoUnimedInd.class);
        startActivity(it);
    }



}