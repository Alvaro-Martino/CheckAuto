package com.example.checkauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class RenaultActivity extends AppCompatActivity {

    ListView lista;


    String[][] datos = {
            {"Renault", "Kwid", "12.058", "Emisiones de CO2: 120 g/km (mixto), Consumo (Urbano) 6.5 l/100 km, Consumo (Extra urbano) 4.4 l/100 km."},
            {"Renault", "Sandero", "11.718", "Emisiones de CO2: 103 g/km (mixto), Consumo (Urbano) 5.8 l/100 km, Consumo (Extra urbano) 4.7 l/100 km."},
    };

    int[] datosImg = {R.drawable.renault_kwid, R.drawable.renault_sandero, };




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
