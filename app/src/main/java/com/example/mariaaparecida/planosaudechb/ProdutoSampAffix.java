package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoSampAffix extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosampaffix);
    }

    public void chamaIdealPlusAffix(View v) {
        Intent it = new Intent(ProdutoSampAffix.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaIdealAffix(View v) {
        Intent it = new Intent(ProdutoSampAffix.this, Tabelagrid.class);
        startActivity(it);
    }
}