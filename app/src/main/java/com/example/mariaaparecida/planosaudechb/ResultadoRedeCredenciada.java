package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.mariaaparecida.planosaudechb.R;

import java.util.ArrayList;

/**
 * Created by Maria Aparecida on 01/02/2018.
 */

public class ResultadoRedeCredenciada extends Activity {


    private ListView listView;
    private EditText edtplano;
    private ImageView imageoperadora;
    private ArrayList<EditText> todosPlanos = new ArrayList<>();
    private ArrayList<ImageView> todasoperadoras = new ArrayList<>();
    private ArrayList<ListView> todasredecredenciada = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultadoredecredenciada);

        ListView listview = (ListView) findViewById(R.id.redecredenciada);
        EditText editText = (EditText) findViewById(R.id.edtplano);
        ImageView imageView = (ImageView) findViewById(R.id.imageoperadora);

        todasoperadoras.add(imageoperadora);
        todosPlanos.add(edtplano);
    }
}
