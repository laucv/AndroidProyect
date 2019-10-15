package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static final String[] misDatos = {
            "Zumo de naranja", "Zumo de piña",
            "Zumo de uva", "Zumo de manzana",
            "Zumo 1", "Zumo 2"
    };

    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.listaLV);

        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                misDatos);

        lista.setAdapter(adaptador);
    }



}
