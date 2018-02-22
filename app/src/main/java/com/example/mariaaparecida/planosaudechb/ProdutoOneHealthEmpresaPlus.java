package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;

import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 22/01/2018.
 */

public class ProdutoOneHealthEmpresaPlus extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoonehealthempresaplus);
    }

    public void onButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.coper:
                if (checked) {
                    Singleton.getInstance().setCooparticipacao(true);

                }

                break;
            case R.id.semcoper:
                if (checked) {
                    Singleton.getInstance().setCooparticipacao(false);
                }
                break;
        }
    }


    public void chamaLincxlt4plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,234,240);
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaLincxlt3plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,233,239);
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt3plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,236,242);
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt4plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,237,245);
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
    public void chamaBlackt5plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,238,246);
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }

    public void chamaBlackt2plus(View v) {
        Singleton.getInstance().escolheIdCooparticipacaoOuIdNormal(this,235,241);
        Intent it = new Intent(ProdutoOneHealthEmpresaPlus.this, Tabelagrid.class);
        startActivity(it);
    }
}
