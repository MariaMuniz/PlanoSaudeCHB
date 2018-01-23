package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoSaudeSistemaEmpresaPlus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosaudesistemaempresaplus);
    }

    public void chamaEssencialPrimeEmpresaplus(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaClassico180Empresaplus(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaClassico200Empresaplus(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaMasterEmpresaplus(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

}
