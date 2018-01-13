package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 09/01/2018.
 */

public class ProdutoUnimedInd extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtounimedind);
    }


    public void chamaPlenoUnimedenf(View v) {
        Intent it = new Intent(ProdutoUnimedInd.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaPlenoUnimedapt(View v) {
        Intent it = new Intent(ProdutoUnimedInd.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnipartapt(View v) {
        Intent it = new Intent(ProdutoUnimedInd.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaUnipartenf(View v) {
        Intent it = new Intent(ProdutoUnimedInd.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnipart50enf(View v) {
        Intent it = new Intent(ProdutoUnimedInd.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUnipart50apt(View v) {
        Intent it = new Intent(ProdutoUnimedInd.this, Tabelagrid.class);
        startActivity(it);
    }



}
