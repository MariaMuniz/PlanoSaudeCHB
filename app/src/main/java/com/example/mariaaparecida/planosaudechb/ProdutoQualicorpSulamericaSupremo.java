package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 23/01/2018.
 */

public class ProdutoQualicorpSulamericaSupremo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpsulamericasupremo);
    }

    public void chamaAmil500Supremo(View v) {
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaExecutivoSulamericaSupremo(View v) {
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaExatoSulamericaSupremo(View v) {
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaEspecialcemSulamericaSupremo(View v) {
        Intent it = new Intent(ProdutoQualicorpSulamericaSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
}
