package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.RedeCredenciada;
import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 02/02/2018.
 */

public class Redecredenciadaaffix extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redecredenciadaaffix);
    }

    public void chamaProdutoSaudeSistemaAffix(View v) {
        Singleton.getInstance().setIdOperadora(2);
        Intent it = new Intent(Redecredenciadaaffix.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamaProdutSampAffix(View v) {
        Singleton.getInstance().setIdOperadora(1);
        Intent it = new Intent(Redecredenciadaaffix.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaProdutoVivamedAffix (View v) {
        Singleton.getInstance().setIdOperadora(3);
        Intent it = new Intent(Redecredenciadaaffix.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }
}

