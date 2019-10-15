package com.example.lista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView text1 = findViewById(R.id.tvItem1);
        TextView text2 = findViewById(R.id.tvItem2);

        Bundle bundle = this.getIntent().getExtras();

        if(bundle!=null){
            int idRecibido = bundle.getInt(MainActivity.CLAVE_POSICION);
            String opcionRecibida = bundle.getString(MainActivity.CLAVE_ITEM);

            text1.setText(String.format(Locale.getDefault(), "%2d", idRecibido));
            text2.setText(opcionRecibida);
        }

    }
}
