package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoAmilEmpresaplus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoamilempresaplus);
    }

    public void chamaAmil200plus(View v) {
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaAmil400plus(View v) {
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil500plus(View v) {
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil700plus(View v) {
        Intent it = new Intent(ProdutoAmilEmpresaplus.this, Tabelagrid.class);
        startActivity(it);
    }
}
