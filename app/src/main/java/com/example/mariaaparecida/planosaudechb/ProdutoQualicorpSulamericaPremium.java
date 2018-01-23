package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 23/01/2018.
 */

public class ProdutoQualicorpSulamericaPremium extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpsulamericapremium);
    }

    public void chamaExecutivoSulamericaPremium(View v) {
        Intent it = new Intent(ProdutoQualicorpSulamericaPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaExatoSulamericaPremium(View v) {
        Intent it = new Intent(ProdutoQualicorpSulamericaPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaEspecialcemSulamericaPremium(View v) {
        Intent it = new Intent(ProdutoQualicorpSulamericaPremium.this, Tabelagrid.class);
        startActivity(it);
    }
}
