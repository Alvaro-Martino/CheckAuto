package com.example.checkauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetallesAuto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_auto);

        TextView marca = (TextView) findViewById(R.id.tbMarcaDescripcion);
        TextView modelo = (TextView) findViewById(R.id.tbModeloDescripcion);
        TextView detalles = (TextView) findViewById(R.id.tvdescripcion);


        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b != null) {
            marca.setText(b.getString("MAR"));
            modelo.setText(b.getString("MOD"));
            detalles.setText(b.getString("DET"));

        }
    }
}
