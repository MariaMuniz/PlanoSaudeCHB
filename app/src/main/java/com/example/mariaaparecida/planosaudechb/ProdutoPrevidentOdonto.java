package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Maria Aparecida on 24/01/2018.
 */

public class ProdutoPrevidentOdonto  extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtoprevidenteodonto);
    }

    public void chamaDiamondPrevident(View v) {
        Intent it = new Intent(ProdutoPrevidentOdonto.this, PrecoOdonto.class);
        startActivity(it);
    }

    public void chamaPlatinumPrevident(View v) {
        Intent it = new Intent(ProdutoPrevidentOdonto.this, PrecoOdonto.class);
        startActivity(it);
    }
    public void chamaOuroPrevident(View v) {
        Intent it = new Intent(ProdutoPrevidentOdonto.this, PrecoOdonto.class);
        startActivity(it);
    }
}
