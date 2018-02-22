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

public class RedeCredenciadaQualicorp  extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.redecredenciadaqualicorp);
    }

    public void chamaAmilSupremoQualicorpRede(View v) {
        Singleton.getInstance().setIdOperadora(7);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamaBradescoPremiumQualicorpRede(View v) {
        Singleton.getInstance().setIdOperadora(8);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaAmilPremiumQualicorpRede(View v) {
        Singleton.getInstance().setIdOperadora(6);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaBradescoSupremoQualicorpRede(View v) {
        Singleton.getInstance().setIdOperadora(9);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaCaixaVoluntarioQualicorpRede (View v) {
        Singleton.getInstance().setIdOperadora(11);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamaCaixaCompulsorioQualicorpRede (View v) {
        Singleton.getInstance().setIdOperadora(10);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }

    public void chamaSulamericaPremiumQualicorpRede (View v) {
        Singleton.getInstance().setIdOperadora(12);
        Intent it = new Intent(RedeCredenciadaQualicorp.this,ResultadoRedeCredenciada.class);
        startActivity(it);
    }
    public void chamaSulamericaSupremoQualicorpRede (View v) {
        Singleton.getInstance().setIdOperadora(13);
        Intent it = new Intent(RedeCredenciadaQualicorp.this, ResultadoRedeCredenciada.class);
        startActivity(it);
    }


}
