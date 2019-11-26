package com.example.ridetec2;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Adaptador extends BaseAdapter {
    private static LayoutInflater inflater = null;
    Context contexto;
    String [][] datos;
    int [] datosIMG;
    int [] datosSIG;

    public Adaptador(Context contexto, String[][] datos, int[] datosIMG, int[] datosSIG) {
        this.contexto = contexto;
        this.datos = datos;
        this.datosIMG = datosIMG;
        this.datosSIG = datosSIG;
        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return datosIMG.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View vista = inflater.inflate(R.layout.activity_elemento_ruta,null);
        final TextView titulo = (TextView)vista.findViewById(R.id.tv_titulo);
        TextView intro = (TextView)vista.findViewById(R.id.tv_intro);
        ImageView imagen = (ImageView)vista.findViewById(R.id.ivp);
        ImageView siguiente = (ImageView)vista.findViewById(R.id.ivsig);
        titulo.setText(datos[i][0]);
        intro.setText(datos[i][1]);
        imagen.setImageResource(datosIMG[i]);
        siguiente.setTag(i);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent visorImagen = new Intent(contexto,VisorImagen.class);
                visorImagen.putExtra("IMG",datosIMG[(Integer) view.getTag()]);
                visorImagen.putExtra("TIT",datos[(Integer) view.getTag()][0]);
                visorImagen.putExtra("DES",datos[(Integer) view.getTag()][2]);

                contexto.startActivity(visorImagen);
            }
        });

        return vista;
    }
}
