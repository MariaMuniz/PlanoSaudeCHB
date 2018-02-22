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

public class RedeCredenciadaAdesao extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redecredenciadaadesao);
    }


    public void chamaAdesaoAffixRede(View v) {
        Singleton.getInstance().setIdPlano(1);
        Intent it = new Intent(RedeCredenciadaAdesao.this, Redecredenciadaaffix.class);
        startActivity(it);
    }

    public void chamaAdesaoAlcareRede(View v) {
        Singleton.getInstance().setIdPlano(2);
        Intent it = new Intent(RedeCredenciadaAdesao.this, RedeCredenciadaAlcare.class);
        startActivity(it);
    }

    public void chamaAdesaoQualicorpRede(View v) {
        Singleton.getInstance().setIdPlano(4);
        Intent it = new Intent(RedeCredenciadaAdesao.this, RedeCredenciadaQualicorp.class);
        startActivity(it);
    }

    public void chamaAdesaoBemBeneficiosRede(View v) {
        Singleton.getInstance().setIdPlano(3);
        Intent it = new Intent(RedeCredenciadaAdesao.this, RedeCredenciadaBemBeneficios.class);
        startActivity(it);
    }

}
