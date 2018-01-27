package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Maria Aparecida on 08/01/2018.
 */

public class Tabelagrid extends Activity {

    private EditText edtvalor0;
    private EditText edtvalor1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabelagrid);


        edtvalor1 = (EditText)findViewById(R.id.edtvalor1);



    }


    public void Chamaresultado(View v) {
        Intent it = new Intent(Tabelagrid.this, Totalsimulado.class);
        startActivity(it);
    }
}
