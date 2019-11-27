package com.example.ridetec2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class pasajero extends AppCompatActivity {
    ListView lv;
    String [][]datos={
            {"la fuente","6:30","mono","6:45","4"},
            {"biblioteca","10:30","OXXO juarez","10:45","1"},
            {"entronque unidad","8:30","gasolineria soriana","8:45","4"}

    };
    int [] datosImg={R.drawable.fuente,R.drawable.biblioteca,R.drawable.crucero};
    int [] datosImg2={R.drawable.mono,R.drawable.oxxo,R.drawable.gasolinera};
    int [] datosSIG={R.drawable.sig};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasajero);
        lv=findViewById(R.id.lv_viajes);

        lv.setAdapter(new Adaptador(this,datos,datosImg,datosSIG,datosImg2));

    }
}
