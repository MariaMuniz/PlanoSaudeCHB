package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 07/01/2018.
 */

public class Adesaoaffix extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adesaoaffix);
    }
    public void chamaProdutoSaudeSistemaAffix(View v) {
        Intent it = new Intent(Adesaoaffix.this,ProdutoSaudeSistemaAffix.class);
        startActivity(it);
    }
    public void chamaProdutSampAffix(View v) {
        Intent it = new Intent(Adesaoaffix.this,ProdutoSampAffix.class);
        startActivity(it);
    }

    public void chamaProdutoVivamedAffix (View v) {
        Intent it = new Intent(Adesaoaffix.this,ProdutoVivamedAffix.class);
        startActivity(it);
    }
}