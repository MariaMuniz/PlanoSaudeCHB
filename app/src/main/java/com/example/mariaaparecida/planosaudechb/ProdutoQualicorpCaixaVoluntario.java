package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 16/01/2018.
 */

public class ProdutoQualicorpCaixaVoluntario extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpcaixavoluntario);
    }

    public void chamaFundamentalVoluntario(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaVitalVoluntario(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCompletoVoluntario(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaCompletomaisVoluntario(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaProntoVoluntario(View v) {
        Intent it = new Intent(ProdutoQualicorpCaixaVoluntario.this, Tabelagrid.class);
        startActivity(it);
    }
}
