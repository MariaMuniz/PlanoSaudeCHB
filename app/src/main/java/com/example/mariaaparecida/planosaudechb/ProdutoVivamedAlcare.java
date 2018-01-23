package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 23/01/2018.
 */

public class ProdutoVivamedAlcare extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtovivamedalcare);
    }

    public void chamaEssencialVivamedAlcare(View v) {
        Intent it = new Intent(ProdutoVivamedAlcare.this,Tabelagrid.class);
        startActivity(it);
    }
    public void chamaIdealVivamedAlcare(View v) {
        Intent it = new Intent(ProdutoVivamedAlcare.this,Tabelagrid.class);
        startActivity(it);
    }

}
