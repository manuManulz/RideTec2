package com.example.ridetec2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class conductorPrincipal extends AppCompatActivity {

    Spinner ruta, ruta2, hora1, pasajeros;
    TextView hora2;
    ImageView iv,iv2;
    Button btn_confi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductor_principal);
        cargarControles();
        cargarEventos();
        String[] opciones = {"Seleccionar un rideTec: ","la fuente", "SAPA", "biblioteca", "presidencia", "alameda", "modelo", "mono", "gasolineria gemelas", "gasolineria soriana",
                "chochos", "OXXO juarez", "adolfo", "entronque unidad", "frontera 1", "frontera 2"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones);
        ruta.setAdapter(adapter);
        ruta2.setAdapter(adapter);

        validar();
        validar2();
        validarHora1();
        validarHora2();
        numPas();
    }

    private void validar() {
        ruta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                iv.setImageResource(0);
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        iv.setImageResource(R.drawable.fuente);
                        break;
                    case 2:
                        iv.setImageResource(R.drawable.sapa);
                        break;
                    case 3:
                        iv.setImageResource(R.drawable.biblioteca);
                        break;
                    case 4:
                        iv.setImageResource(R.drawable.presidencia);
                        break;
                    case 5:
                        iv.setImageResource(R.drawable.alameda);
                        break;
                    case 6:
                        iv.setImageResource(R.drawable.modelo);
                        break;
                    case 7:
                        iv.setImageResource(R.drawable.mono);
                        break;
                    case 8:
                        iv.setImageResource(R.drawable.gemelas);
                        break;
                    case 9:
                        iv.setImageResource(R.drawable.gasolinera);
                        break;
                    case 10:
                        iv.setImageResource(R.drawable.chochos);
                        break;
                    case 11:
                        iv.setImageResource(R.drawable.oxxo);
                        break;
                    case 12:
                        iv.setImageResource(R.drawable.adolfo);
                        break;
                    case 13:
                        iv.setImageResource(R.drawable.crucero);
                        break;
                    case 14:
                        iv.setImageResource(R.drawable.frontera1);
                        break;
                    case 15:
                        iv.setImageResource(R.drawable.frontera2);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void validar2() {
        ruta2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                iv2.setImageResource(0);
                switch (position) {
                    case 0:
                        break;
                    case 1:
                        iv2.setImageResource(R.drawable.fuente);
                        break;
                    case 2:
                        iv2.setImageResource(R.drawable.sapa);
                        break;
                    case 3:
                        iv2.setImageResource(R.drawable.biblioteca);
                        break;
                    case 4:
                        iv2.setImageResource(R.drawable.presidencia);
                        break;
                    case 5:
                        iv2.setImageResource(R.drawable.alameda);
                        break;
                    case 6:
                        iv2.setImageResource(R.drawable.modelo);
                        break;
                    case 7:
                        iv2.setImageResource(R.drawable.mono);
                        break;
                    case 8:
                        iv2.setImageResource(R.drawable.gemelas);
                        break;
                    case 9:
                        iv2.setImageResource(R.drawable.gasolinera);
                        break;
                    case 10:
                        iv2.setImageResource(R.drawable.chochos);
                        break;
                    case 11:
                        iv2.setImageResource(R.drawable.oxxo);
                        break;
                    case 12:
                        iv2.setImageResource(R.drawable.adolfo);
                        break;
                    case 13:
                        iv2.setImageResource(R.drawable.crucero);
                        break;
                    case 14:
                        iv2.setImageResource(R.drawable.frontera1);
                        break;
                    case 15:
                        iv2.setImageResource(R.drawable.frontera2);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void validarHora1() {
        String [] hora={"6:30", "7:30", "8:30", "9:30", "10:30", "11:30", "12:30", "13:30", "14:30", "15:30", "16:30", "17:30"};
        ArrayAdapter<String> adapter3= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, hora);
        hora1.setAdapter(adapter3);
    }

    private void validarHora2() {
        hora1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        hora2.setText("6:45");
                        break;
                    case 1:
                        hora2.setText("7:45");
                        break;
                    case 2:
                        hora2.setText("8:45");
                        break;
                    case 3:
                        hora2.setText("9:45");
                        break;
                    case 4:
                        hora2.setText("10:45");
                        break;
                    case 5:
                        hora2.setText("11:45");
                        break;
                    case 6:
                        hora2.setText("12:45");
                        break;
                    case 7:
                        hora2.setText("13:45");
                        break;
                    case 8:
                        hora2.setText("14:45");
                        break;
                    case 9:
                        hora2.setText("15:45");
                        break;
                    case 10:
                        hora2.setText("16:45");
                        break;
                    case 11:
                        hora2.setText("17:45");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void cargarEventos() {
    }

    private void numPas(){
        String[] opciones = {"No. pasajeros","1","2", "3", "4"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones);
        pasajeros.setAdapter(adapter);
    }
    private void cargarControles() {
        ruta=findViewById(R.id.sp_ruta1);
        ruta2=findViewById(R.id.sp_ruta2);
        hora1=findViewById(R.id.sp_hora1);
        pasajeros=findViewById(R.id.sp_pas);
        hora2=findViewById(R.id.tv_hora2);
        iv=findViewById(R.id.iv);
        iv2=findViewById(R.id.iv2);
        btn_confi=findViewById(R.id.btn_confir);
    }
}
