package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 17/02/2018.
 */

public class ProdutoAmbPromed extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoambpromed);
    }

    public void chamaSlimIndividualPromed(View v) {
        Singleton.getInstance().setIdOperadora(301);
        Intent it = new Intent(ProdutoAmbPromed.this, Tabelagrid.class);
        startActivity(it);

    }
    public void chamaSlimEmpresarialPromed(View v) {
        Singleton.getInstance().setIdOperadora(302);
        Intent it = new Intent(ProdutoAmbPromed.this, TabelaPromed.class);
        startActivity(it);

    }
}
