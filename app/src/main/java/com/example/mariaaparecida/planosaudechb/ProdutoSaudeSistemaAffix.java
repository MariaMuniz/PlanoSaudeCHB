package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoSaudeSistemaAffix extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosaudesistemaaffix);
    }

    public void chamaConsaude(View v) {
        Intent it = new Intent(ProdutoSaudeSistemaAffix.this, Tabelagrid.class);
        startActivity(it); }

    public void chamaSaudeMulti(View v){
                Intent it = new Intent(ProdutoSaudeSistemaAffix.this, Tabelagrid.class);
                startActivity(it);
            }
    }