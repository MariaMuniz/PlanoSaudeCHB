package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 06/01/2018.
 */

public class Empresa extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empresa1);
    }


    public void chamaOneHealtEmpresa(View v) {
        Intent it = new Intent(Empresa.this,ProdutoOnehealtEmpresas.class);
        startActivity(it);
    }
    public void chamaSampEmpresa(View v) {
        Intent it = new Intent(Empresa.this,ProdutoSampEmpresas.class);
        startActivity(it);
    }
    public void chamaUnimedEmpresa(View v) {
        Intent it = new Intent(Empresa.this,ProdutoUnimedEmpresas.class);
        startActivity(it);
    }

    public void chamaVitalisEmpresa(View v) {
        Intent it = new Intent(Empresa.this,ProdutoVitallisEmpresa.class);
        startActivity(it);
    }

    public void chamaGoodlifeEmpresa(View v) {
        Intent it = new Intent(Empresa.this,ProdutogoodlifeEmpresa.class);
        startActivity(it);
    }

    public void chamaSaudeSistemaEmpresa(View v) {
        Intent it = new Intent(Empresa.this,ProdutoSaudeSistemaEmpresa.class);
        startActivity(it);
    }

    public void chamaPromedEmpresa(View v) {
        Intent it = new Intent(Empresa.this,ProdutoPromedEmpresa.class);
        startActivity(it);
    }
    public void chamaAmilEmpresa(View v) {
        Intent it = new Intent(Empresa.this,ProdutosAmil.class);
        startActivity(it);
    }
}
