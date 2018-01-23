package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutogoodlifeEmpresa extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosgoodlifeempresas);
    }

    public void chamaMultiGood(View v) {
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUniqueGood(View v) {
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUniqueGoodlife(View v) {
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamasSemobstetricia(View v) {
        Intent it = new Intent(ProdutogoodlifeEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
}
