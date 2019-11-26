package com.example.ridetec2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText mat,con,matReg;
    Spinner combo;
    Button login,registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarControles();
        cargarEventos();
        String [] opciones = {"pasajero","conductor"};
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        combo.setAdapter(adapter);

        
    }

    private void cargarEventos() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarPersona();
            }
        });
    }
    private void verificarPersona() {

        final String seleccion = combo.getSelectedItem().toString();
        if (seleccion.equals("pasajero")){
            Intent pasajero = new Intent(MainActivity.this, pasajero.class);
            startActivity(pasajero);
        }else if (seleccion.equals("conductor")){
            Intent conductor = new Intent(MainActivity.this, conductorPrincipal.class);
            startActivity(conductor);
        }
    }

    private void cargarControles() {
        mat=findViewById(R.id.et_mat);
        con=findViewById(R.id.et_con);
        matReg=findViewById(R.id.et_regCon);
        combo=findViewById(R.id.sp_ruta2);
        login=findViewById(R.id.btn_entrar);
        registrar=findViewById(R.id.btn_reg);
    }
}
