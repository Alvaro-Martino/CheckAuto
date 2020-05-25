package com.example.checkauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ChevroletActivity extends AppCompatActivity {
    ListView lista;


    String[][] datos = {
            {"Chevrolet", "Onix", "16.541", "Emisiones de CO2: 140 g/Km, Consumo (Urbano) 9.7 l/100 km, Consumo (Extra urbano) 7.9 l/100 km."},
    };

    int[] datosImg = {R.drawable.chevrolet_onix, };

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
