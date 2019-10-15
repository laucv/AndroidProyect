package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    static final String TAG_LAURA = "Laura";

    private String[] misDatos;

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        misDatos = getResources().getStringArray(R.array.datos);
        lista = findViewById(R.id.listaLV);

        MiAdaptador miAdaptador = new MiAdaptador(this, R.layout.item_lista, misDatos);

        lista.setAdapter(miAdaptador);
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String texto = "Opcion elegida: " + position + " -> " +  parent.getItemAtPosition((int) id).toString();

        Log.i(TAG_LAURA, "Opción: " + position + " -> " +  parent.getItemAtPosition((int) id).toString());
        //Barras que aparecen por debajo
        Snackbar.make(parent, texto, Snackbar.LENGTH_LONG).show();
    }
}
