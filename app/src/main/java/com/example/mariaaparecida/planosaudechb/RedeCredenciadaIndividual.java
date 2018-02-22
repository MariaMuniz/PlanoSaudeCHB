package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.mariaaparecida.planosaudechb.R;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 01/02/2018.
 */

public class RedeCredenciadaIndividual extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redecrecenciadaindividual);
    }

    public void chamaProdutoVitallis(View v) {
        Singleton.getInstance().setIdOperadora(52);
        Intent it = new Intent(RedeCredenciadaIndividual.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaProdutoGood(View v) {
        Singleton.getInstance().setIdOperadora(50);
        Intent it = new Intent(RedeCredenciadaIndividual.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }


    public void chamaProdutoUnimed(View v) {
        Singleton.getInstance().setIdOperadora(51);
        Intent it = new Intent(RedeCredenciadaIndividual.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }


}
