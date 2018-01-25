package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 24/01/2018.
 */

public class ProdutoAmilDentalJuridica  extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoamildentajuridica);
    }

    public void chamaPorteum(View v) {
        Intent it = new Intent(ProdutoAmilDentalJuridica.this, PrecoOdonto.class);
        startActivity(it);
    }
    public void chamaPortedois(View v) {
        Intent it = new Intent(ProdutoAmilDentalJuridica.this, PrecoOdonto.class);
        startActivity(it);
    }
}
