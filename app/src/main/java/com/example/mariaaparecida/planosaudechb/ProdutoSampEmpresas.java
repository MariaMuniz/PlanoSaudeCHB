package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoSampEmpresas extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosampempresa);
    }

    public void chamaPreferencial(View v) {
        Intent it = new Intent(ProdutoSampEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaRedeAmpla(View v) {
        Intent it = new Intent(ProdutoSampEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaRedeAmplaSemObs(View v) {
        Intent it = new Intent(ProdutoSampEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

}
