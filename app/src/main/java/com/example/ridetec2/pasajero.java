package com.example.ridetec2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class pasajero extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasajero);
        lv=findViewById(R.id.lv_viajes);

    }
}
