package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 07/01/2018.
 */

public class Empresaplus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empresaplus);
    }
    public void chamaSaudeSistemaEmpresaPlus(View v) {
        Intent it = new Intent(Empresaplus.this,ProdutoSaudeSistemaEmpresaPlus.class);
        startActivity(it);
    }
    public void chamaPromedEmpresaPlus(View v) {
        Intent it = new Intent(Empresaplus.this,ProdutoPromedEmprsaPlus.class);
        startActivity(it);
    }
    public void chamaUnimedEmpresaPlus(View v) {
        Intent it = new Intent(Empresaplus.this,ProdutoUnimedEmpresaPlus.class);
        startActivity(it);
    }
    public void chamaAmilEmpresaPlus(View v) {
        Intent it = new Intent(Empresaplus.this,ProdutoAmilEmpresaplus.class);
        startActivity(it);
    }
    public void chamaOnehealthEmpresaPlus(View v) {
        Intent it = new Intent(Empresaplus.this,ProdutoOneHealthEmpresaPlus.class);
        startActivity(it);
    }
}
