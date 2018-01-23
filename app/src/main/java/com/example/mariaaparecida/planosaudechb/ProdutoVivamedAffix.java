package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoVivamedAffix extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtovivamedaffix);
    }

    public void chamaEssencialVivamedAffix(View v) {
        Intent it = new Intent(ProdutoVivamedAffix.this,Tabelagrid.class);
        startActivity(it);
    }
    public void chamaIdealVivamedAffix(View v) {
        Intent it = new Intent(ProdutoVivamedAffix.this,Tabelagrid.class);
        startActivity(it);
    }

}
