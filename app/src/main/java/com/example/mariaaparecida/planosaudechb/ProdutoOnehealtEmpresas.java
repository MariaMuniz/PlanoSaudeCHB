package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoOnehealtEmpresas extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosonehealtempresas);
    }


    public void chamaLincxlt4(View v) {
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaLincxlt3(View v) {
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt3(View v) {
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaBlackt4(View v) {
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaBlackt5(View v) {
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt2(View v) {
        Intent it = new Intent(ProdutoOnehealtEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }
}