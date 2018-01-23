package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 09/01/2018.
 */

public class ProdutoBemBeneficios extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtobembeneficios);
    }

    public void chamaBemBeneficiosSaudeMulti(View v) {
        Intent it = new Intent(ProdutoBemBeneficios.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaBemBeneficiosConsaude(View v) {
        Intent it = new Intent(ProdutoBemBeneficios.this, Tabelagrid.class);
        startActivity(it);
    }
}
