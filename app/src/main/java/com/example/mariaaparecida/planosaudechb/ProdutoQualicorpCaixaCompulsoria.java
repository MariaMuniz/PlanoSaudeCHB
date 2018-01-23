package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 16/01/2018.
 */

public class ProdutoQualicorpCaixaCompulsoria
        extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpcaixacompulsorio);
    }

    public void chamaFundamentalCompulsorio(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaVitalCompulsorio(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCompletoCompulsorio(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCompletomaisCompulsorio(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaProntoCompulsorio(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaCompulsoria.this, Tabelagrid.class);
        startActivity(it);
    }
}
