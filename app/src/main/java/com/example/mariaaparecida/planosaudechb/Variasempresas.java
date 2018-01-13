package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 06/01/2018.
 */

public class Variasempresas extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.variasempresas);
    }


    public void chamaEmpresa(View v) {
        Intent it = new Intent(Variasempresas.this, Empresa.class);
        startActivity(it);
    }


    public void chamaEmpresaplus(View v) {
        Intent it = new Intent(Variasempresas.this, Empresaplus.class);
        startActivity(it);
    }
}