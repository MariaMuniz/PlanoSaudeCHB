package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoUnimedEmpresaPlus extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtouminedempresaplus);
    }

    public void chamaUnipartFlex30plus(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnipartFlex50plus(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUnifacilFlex30plus(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnifacilFlex50plus(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaUnimaxplus(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPlenoUnimedEmpresaplus(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

}
