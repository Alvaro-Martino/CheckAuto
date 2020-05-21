package com.example.checkauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lista;

    String[][] datos = {
            {"Toyota", "Hilux", "25.120", "Emisiones de CO2: 183 g/km (mixto), Consumo (Urbano) 7.4 l/100 km, Consumo (Extra urbano)6.7 l/100 km."},
            {"Ford", "Ka", "16.630", "Emisiones de CO2: 129 g/km (mixto), Consumo (Urbano) 6.5 l/100 km, Consumo (Extra urbano) 3.9 l/100 km."},
            {"Chevrolet", "Onix", "16.541", "Emisiones de CO2: 140 g/Km, Consumo (Urbano) 9.7 l/100 km, Consumo (Extra urbano) 7.9 l/100 km."},
            {"Toyota", "Etios", "15.748", "Emisiones de CO2: 120 g/km (mixto)”, Consumo (Urbano) 11 l/100 km, Consumo (Extra urbano) 7.7 l/100 km."},
            {"Volkswagen", "Gol", "13.633", "Emisiones de CO2: 170 g/km), Consumo (Urbano) 9.1 l/100 km, Consumo (Extra urbano) 6.1 l/100 km"},
            {"Volkswagen", "Amaroksdk", "12.669", "Emisiones de CO2: 232 g/km (mixto), Consumo (Urbano) 9.6 l/100 km, Consumo (Extra urbano) 8.4 l/100 km."},
            {"Peugeot", "208", "12.110", "Emisiones de CO2: 97 g/km (mixto), Consumo (Urbano) 5.2 l/100 km, Consumo (Extra urbano) 3.7 l/100 km."},
            {"Renault", "Kwid", "12.058", "Emisiones de CO2: 120 g/km (mixto), Consumo (Urbano) 6.5 l/100 km, Consumo (Extra urbano) 4.4 l/100 km."},
            {"Renault", "Sandero", "11.718", "Emisiones de CO2: 103 g/km (mixto), Consumo (Urbano) 5.8 l/100 km, Consumo (Extra urbano) 4.7 l/100 km."},
            {"Ford", "Ranger", "11.635", "Emisiones de CO2: 233 g/km (mixto), Consumo (Urbano) 9.7 l/100 km, Consumo (Extra urbano) 7.4 l/100 km."},
        };

    int[] datosImg = {R.drawable.toyota_hilux, R.drawable.ford_ka, R.drawable.chevrolet_onix, R.drawable.toyota_etios, R.drawable.volk_gol_trend, R.drawable.volk_amarok, R.drawable.peugeot_208, R.drawable.renault_kwid, R.drawable.renault_sandero, R.drawable.ford_ranger, };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
