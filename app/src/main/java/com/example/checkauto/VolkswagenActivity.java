package com.example.checkauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class VolkswagenActivity extends AppCompatActivity {

    ListView lista;


    String[][] datos = {
            {"Volkswagen", "Gol", "13.633", "Emisiones de CO2: 170 g/km), Consumo (Urbano) 9.1 l/100 km, Consumo (Extra urbano) 6.1 l/100 km"},
            {"Volkswagen", "Amaroksdk", "12.669", "Emisiones de CO2: 232 g/km (mixto), Consumo (Urbano) 9.6 l/100 km, Consumo (Extra urbano) 8.4 l/100 km."},
    };

    int[] datosImg = {R.drawable.volk_gol_trend, R.drawable.volk_amarok, };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota);

        lista = (ListView) findViewById(R.id.miLista);

        lista.setAdapter(new Adaptador(this, datos, datosImg));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), DetallesAuto.class);
                visorDetalles.putExtra("MAR", datos[position][0]);
                visorDetalles.putExtra("DET", datos[position][3]);
                visorDetalles.putExtra("MOD", datos[position][1]);
                startActivity(visorDetalles);
            }
        });



    }

}
