package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 07/01/2018.
 */

public class AdesaoQualicorp extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adesaoqualicorp);
    }

    public void chamaAmilSupremoQualicorp(View v) {
        Singleton.getInstance().setIdOperadora(7);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpAmilSupremo.class);
        startActivity(it);
    }
    public void chamaBradescoPremiumQualicorp(View v) {
        Singleton.getInstance().setIdOperadora(8);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoqualicorpBradescoPremium.class);
        startActivity(it);
    }

    public void chamaAmilPremiumQualicorp(View v) {
        Singleton.getInstance().setIdOperadora(6);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpAmilPremium.class);
        startActivity(it);
    }

    public void chamaBradescoSupremoQualicorp(View v) {
        Singleton.getInstance().setIdOperadora(9);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpBradescoSupremo.class);
        startActivity(it);
    }

    public void chamaCaixaVoluntarioQualicorp (View v) {
        Singleton.getInstance().setIdOperadora(11);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpCaixaVoluntario.class);
        startActivity(it);
    }
    public void chamaCaixaCompulsorioQualicorp (View v) {
        Singleton.getInstance().setIdOperadora(10);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpCaixaCompulsoria.class);
        startActivity(it);
    }

    public void chamaSulamericaPremiumQualicorp (View v) {
        Singleton.getInstance().setIdOperadora(12);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpSulamericaPremium.class);
        startActivity(it);
    }
    public void chamaSulamericaSupremoQualicorp (View v) {
        Singleton.getInstance().setIdOperadora(13);
        Intent it = new Intent(AdesaoQualicorp.this,ProdutoQualicorpSulamericaSupremo.class);
        startActivity(it);
    }


}

