package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

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
        Intent it = new Intent(AdesaoAlcare.this, ProdutoBradescoAlcare.class);
        startActivity(it);
    }
    public void chamaVivamedAlcare(View v) {
        Intent it = new Intent(AdesaoAlcare.this, ProdutoVivamedAlcare.class);
        startActivity(it);
    }
    public void chamaSampAlcare(View v) {
        Intent it = new Intent(AdesaoAlcare.this, ProdutoSampAlcare.class);
        startActivity(it);
    }

    public void chamaVitallisAlcare(View v) {
        Intent it = new Intent(AdesaoAlcare.this, ProdutoVitallisAlcare.class);
        startActivity(it);
    }
}
