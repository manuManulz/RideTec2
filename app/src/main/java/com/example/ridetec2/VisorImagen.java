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
        ImageView img2=findViewById(R.id.imagencompleta2);
        TextView  tvhs=findViewById(R.id.tv_hs);
        TextView tvhpe =findViewById(R.id.tv_hpe);
        TextView tvrt=findViewById(R.id.tv_rt);
        TextView tvTIT=findViewById(R.id.tvTitulo);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null){
            img.setImageResource(b.getInt("IMG"));
            tvTIT.setText(b.getString("TIT"));
            tvhs.setText(b.getString("HR1"));
            tvrt.setText(b.getString("PRT"));
            tvhpe.setText(b.getString("HR2"));
            img2.setImageResource(b.getInt("IMG2"));
        }
    }
}
