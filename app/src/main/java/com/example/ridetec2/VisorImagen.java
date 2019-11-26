package com.example.ridetec2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VisorImagen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen);
        ImageView img=findViewById(R.id.imagencompleta);
        TextView tvTIT=findViewById(R.id.tvTitulo);
        TextView tvDES=findViewById(R.id.tvDescripcion);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null){
            img.setImageResource(b.getInt("IMG"));
            tvTIT.setText(b.getString("TIT"));
            tvDES.setText(b.getString("DES"));
        }
    }
}
