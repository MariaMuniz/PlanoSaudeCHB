package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 15/01/2018.
 */

public class ProdutoUnimedEmpresas extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtounimedempresas);
    }

    public void chamaUnipartFlex30(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnipartFlex50(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaUnifacilFlex30(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaUnifacilFlex50(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }


    public void chamaUnimax(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaPlenoUnimedEmpresa(View v) {
        Intent it = new Intent(ProdutoUnimedEmpresas.this, Tabelagrid.class);
        startActivity(it);
    }
}


