package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 09/01/2018.
 */

public class ProdutoAmbulatorialPremium extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoambulatorialpremium);
    }



    public void chamaOuroPremiumAmb(View v) {
        Intent it = new Intent(ProdutoAmbulatorialPremium.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaPrataPremiumAmb(View v) {
        Intent it = new Intent(ProdutoAmbulatorialPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPlatinaPremiumAmb(View v) {
        Intent it = new Intent(ProdutoAmbulatorialPremium.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBronzePremiumAmb(View v) {
        Intent it = new Intent(ProdutoAmbulatorialPremium.this, Tabelagrid.class);
        startActivity(it);
    }
}


