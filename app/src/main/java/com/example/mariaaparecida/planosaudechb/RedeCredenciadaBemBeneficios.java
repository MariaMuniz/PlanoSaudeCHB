package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 02/02/2018.
 */

public class RedeCredenciadaBemBeneficios extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redecredenciadabembeneficios);
    }
    public void chamaProdutoBemBeneficiosRede(View v) {
        Singleton.getInstance().setIdOperadora(58);
        Intent it = new Intent(RedeCredenciadaBemBeneficios.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }
}
