package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoAmbulatorialGood extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoambulatorialgood);
    }

    public void chamaStoneAmb(View v) {
        Intent it = new Intent(ProdutoAmbulatorialGood.this, Tabelagrid.class);
        startActivity(it);
    }
}
