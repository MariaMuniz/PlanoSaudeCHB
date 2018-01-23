package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoSaudeSistemaEmpresa extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosaudesistemaempresa);
    }

    public void chamaEssencialPrimeEmpresa(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaClassico180Empresa(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaClassico200Empresa(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaMasterEmpresa(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresa.this, Tabelagrid.class);
        startActivity(it);
    }

}

