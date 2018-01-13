package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 08/01/2018.
 */

public class Tabelagrid extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabelagrid);
    }


    public void Chamaresultado(View v) {
        Intent it = new Intent(Tabelagrid.this, Totalsimulado.class);
        startActivity(it);
    }
}
