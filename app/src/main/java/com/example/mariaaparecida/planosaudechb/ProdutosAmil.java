package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

/**
 * Created by Maria Aparecida on 13/01/2018.
 */

public class ProdutosAmil extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtosamil);
    }

    public void onRadioButtonClicked(View view) {
       String acomodacao = "";
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.apt:
                if (checked){
                    acomodacao = "apartamento";
                }

                    break;
            case R.id.enf:
                if (checked){
                    acomodacao = "enfermaria";
                }

                    break;
        }
    }

    public void onButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.coper:
                if (checked){

                }

                    break;
            case R.id.semcoper:
                if (checked){

                }

                    break;
        }
    }

    public void chamaAmil200(View v) {
        Intent it = new Intent(ProdutosAmil.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaAmil400(View v) {
        Intent it = new Intent(ProdutosAmil.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil500(View v) {
        Intent it = new Intent(ProdutosAmil.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaAmil700(View v) {
        Intent it = new Intent(ProdutosAmil.this, Tabelagrid.class);
        startActivity(it);
    }
}
