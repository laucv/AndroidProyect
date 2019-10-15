package com.example.lista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class MiAdaptador extends ArrayAdapter {

    private Context context;
    private int idLayout;
    private String[] misDatos;


    /**
     * Constructor. This constructor will result in the underlying data collection being
     * immutable, so methods such as {@link #clear()} will throw an exception.
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param data     The data to represent in the ListView.
     */
    public MiAdaptador(@NonNull Context context, int resource, @NonNull String[] data) {
        super(context, resource, data);
        this.context = context;
        this.idLayout = resource;
        this.misDatos = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LinearLayout vista;

        if (null != convertView) {
            //Recibimos una vista para ser reciclada
            vista = (LinearLayout) convertView;
        } else {
            //No recibimos nada, por lo que utilizamos el inflador
            LayoutInflater inflador = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vista = (LinearLayout) inflador.inflate(idLayout, parent, false);
        }

        //asignar contenido a los elementos de la vista
        TextView tvLinea1 = vista.findViewById(R.id.tvItemLinea1);
        ImageView imgItem = vista.findViewById(R.id.imgItem);
        TextView tvLinea2 = vista.findViewById(R.id.tvItemLinea2);

        tvLinea1.setText("Posición = " + position);
        tvLinea2.setText(misDatos[position]);
        imgItem.setImageResource(R.mipmap.ic_launcher);

        return vista;
    }
}
