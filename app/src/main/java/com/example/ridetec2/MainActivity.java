package com.example.ridetec2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mat,con,matReg;
    Spinner combo;
    Button login,registrar;
    Conexion bd = new Conexion();


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
        if (seleccion.equals("pasajero") && mat.getText().toString().equals("s16030169") && con.getText().toString().equals("123")
                || seleccion.equals("pasajero") && mat.getText().toString().equals("s16030188") && con.getText().toString().equals("123")
                || seleccion.equals("pasajero") && mat.getText().toString().equals("s16030187") && con.getText().toString().equals("123")
                || seleccion.equals("pasajero") && mat.getText().toString().equals("s16030182") && con.getText().toString().equals("123")
                || seleccion.equals("pasajero") && mat.getText().toString().equals("s16030176") && con.getText().toString().equals("123")){
                Toast.makeText(this, "Bienvenido pasajero", Toast.LENGTH_SHORT).show();
                Intent pasajero = new Intent(MainActivity.this, pasajero.class);
                startActivity(pasajero);
            
        }else if (seleccion.equals("conductor") && mat.getText().toString().equals("s16030169") && con.getText().toString().equals("123")
                || seleccion.equals("conductor") && mat.getText().toString().equals("s16030188") && con.getText().toString().equals("123")
                ||seleccion.equals("conductor") && mat.getText().toString().equals("s16030187") && con.getText().toString().equals("123")
                ||seleccion.equals("conductor") && mat.getText().toString().equals("s16030182") && con.getText().toString().equals("123")
                ||seleccion.equals("conductor") && mat.getText().toString().equals("s16030176") && con.getText().toString().equals("123")){
                Toast.makeText(this, "Bienvenido conductor", Toast.LENGTH_SHORT).show();
                Intent conductor = new Intent(MainActivity.this, conductorPrincipal.class);
                startActivity(conductor);
        }
    }

    /*private boolean consultarpasajero() {
        boolean pasajero=false;
        String var="";
        try{
            bd.conectar();
           String query="SELECT usuariosp, password from pasajeros where usuariosp='"+mat.getText()+"' and password='"+con.getText()+"'";
           bd.miSentencia=bd.miConexion.createStatement();
           bd.miResultado=bd.miSentencia.executeQuery(query);
            Toast.makeText(this, query, Toast.LENGTH_SHORT).show();

            while(bd.miResultado.next()){
                var = bd.miResultado.getString(1);
            }
            if(var.length()>0){
                Toast.makeText(this, var, Toast.LENGTH_SHORT).show();
                pasajero=true;
            }
        }catch(Exception e){
            Toast.makeText(this, "consutla pas"+e, Toast.LENGTH_SHORT).show();
        }
        return pasajero;
    }*/

    private void cargarControles() {
        mat=findViewById(R.id.et_mat);
        con=findViewById(R.id.et_con);
        matReg=findViewById(R.id.et_regCon);
        combo=findViewById(R.id.sp_ruta2);
        login=findViewById(R.id.btn_entrar);
        registrar=findViewById(R.id.btn_reg);
    }
}
