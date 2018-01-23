package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 23/01/2018.
 */

public class ProdutoBradescoAlcare extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtobradescoalcare);
    }
    public void chamaTopPlus3Alcare(View v) {
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaTopPlus2Alcare(View v) {
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus1Alcare(View v) {
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaNacionalFlexAlcare(View v) {
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopNacionalAlcare(View v) {
        Intent it = new Intent(ProdutoBradescoAlcare.this, Tabelagrid.class);
        startActivity(it);
    }
}
