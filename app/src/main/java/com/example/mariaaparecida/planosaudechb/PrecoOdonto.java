package com.example.mariaaparecida.planosaudechb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Dao.PrecoDAO;
import Entidades.Preco;
import Entidades.Singleton;

/**
 * Created by Maria Aparecida on 24/01/2018.
 */

public class PrecoOdonto extends Activity {
/*
    private EditText edtnomeplano;
    private EditText edtnomeproduto;
    private TextView edtprecodonto;
    private ArrayList<EditText> todosPrecos = new ArrayList<>();
    private ArrayList<EditText> todasQtds = new ArrayList<>();
    private ArrayList<EditText> todosResultados = new ArrayList<>();  */


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.precoodonto);
    }

/*
        edtnomeproduto = (EditText) findViewById(R.id.edtnomeproduto);
        edtnomeplano = (EditText) findViewById(R.id.edtnomeplano);
        edtprecodonto = (EditText) findViewById(R.id.edtprecodonto);


        todosPrecos.add(edtprecodonto);


        int idPlano = Singleton.getInstance().getIdPlano();
        int idOperadora = Singleton.getInstance().getIdOperadora();
        int idProduto = Singleton.getInstance().getIdProduto();


        PrecoDAO dao = new PrecoDAO(this);
        //List<Preco> precos = dao.recuperarTodos();
        String query = "SELECT * FROM  preco where id_produto = " + idProduto + " and id_plano = " + idPlano + " and id_operadora = " + idOperadora;
        List<Preco> precos = dao.recuperarPorQuery(query);
        Log.d("log_tag_query", query);
        if (precos.size() == 0) {
            Toast.makeText(this, "Erro ao executar query = " + query, Toast.LENGTH_LONG);
            return;
        }
        for (Preco r : precos) {
            Log.d("log_tag", "P = " + r.toString());
        }

        for (int i = 0; i < precos.size(); i++) {
            todosPrecos.get(i).setText("" + precos.get(i).getValor());
            todosPrecos.get(i).setEnabled(false); //so pra desativar edicao dos precos
        }
    }*/

    }


