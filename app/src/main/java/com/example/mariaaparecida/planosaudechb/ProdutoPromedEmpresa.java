package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoPromedEmpresa extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtopromedempresa);
    }

    public void chamaConfortPromedEmpresa(View v) {
        Intent it = new Intent(ProdutoPromedEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaSelectPromedEmpresa(View v) {
        Intent it = new Intent(ProdutoPromedEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaLifePromedEmpresa(View v) {
        Intent it = new Intent(ProdutoPromedEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }

}
