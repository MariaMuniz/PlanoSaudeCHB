package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoPromedEmprsaPlus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtopromedempresaplus);
    }

    public void chamaConfortPromedEmpresaplus(View v) {
        Intent it = new Intent(ProdutoPromedEmprsaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaSelectPromedEmpresaplus(View v) {
        Intent it = new Intent(ProdutoPromedEmprsaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaLifePromedEmpresaplus(View v) {
        Intent it = new Intent(ProdutoPromedEmprsaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
}
