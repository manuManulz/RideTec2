package com.example.ridetec2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VisorImagen extends AppCompatActivity {
    Button btnPs, btnPe;
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
         btnPs=findViewById(R.id.btn_ps);
         btnPe = findViewById(R.id.btn_pe);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        cargarEventos();

        if(b!=null){
            img.setImageResource(b.getInt("IMG"));
            tvTIT.setText(b.getString("TIT"));
            tvhs.setText(b.getString("HR1"));
            tvrt.setText(b.getString("PRT"));
            tvhpe.setText(b.getString("HR2"));
            img2.setImageResource(b.getInt("IMG2"));
        }
    }

    private void cargarEventos() {
        btnPs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VisorImagen.this, "Viaje confirmado", Toast.LENGTH_SHORT).show();
                Intent visor = new Intent(VisorImagen.this, MainActivity.class);
                startActivity(visor);
                finish();
            }
        });
        btnPe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(VisorImagen.this, "Viaje confirmado", Toast.LENGTH_SHORT).show();
                Intent visor = new Intent(VisorImagen.this, MainActivity.class);
                startActivity(visor);
                finish();
            }
        });
    }

}
