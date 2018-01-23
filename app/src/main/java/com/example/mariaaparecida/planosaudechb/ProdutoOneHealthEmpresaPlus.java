package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoOneHealthEmpresaPlus extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoonehealthempresaplus);
    }


    public void chamaLincxlt4plus(View v) {
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaLincxlt3plus(View v) {
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt3plus(View v) {
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaBlackt4plus(View v) {
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaBlackt5plus(View v) {
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt2plus(View v) {
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
}
