package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 16/01/2018.
 */

public class ProdutoQualicorpBradescoSupremo extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoqualicorpbradescosupremo);
    }

    public void chamaTopNacionalSupremo(View v) {
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaNacionalFlexSupremo(View v) {
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus1Supremo(View v) {
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaTopPlus2Supremo(View v) {
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaTopPlus3Supremo(View v) {
        Intent it = new Intent(ProdutoQualicorpBradescoSupremo.this, Tabelagrid.class);
        startActivity(it);
    }
}
