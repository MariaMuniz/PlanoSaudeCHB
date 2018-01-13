package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 08/01/2018.
 */

public class ProdutoVitallisind extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtovitallis);
    }

    public void chamaOuroVitallis(View v) {
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPrataVitallis(View v) {
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaOuroFamiliarVitallis(View v) {
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPrataFamiliarVitallis(View v) {
        Intent it = new Intent(ProdutoVitallisind.this, Tabelagrid.class);
        startActivity(it);
    }
}

