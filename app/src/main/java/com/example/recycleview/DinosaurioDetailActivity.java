package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DinosaurioDetailActivity extends AppCompatActivity {
    TextView txtNombre, txtTipo, txtDescripcion;
    ImageView imgDino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinosaurio_detail);

        txtNombre = findViewById(R.id.txtNombreDetail);
        txtTipo = findViewById(R.id.txtTipoDetail);
        txtDescripcion = findViewById(R.id.txtDescripcionDetail);
        imgDino = findViewById(R.id.imgDinoDetail);

        // Obtener los datos enviados desde el intent
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String tipo = intent.getStringExtra("tipo");
        String descripcion = intent.getStringExtra("descripcion");
        int imagen = intent.getIntExtra("imagen", 0);

        // Configurar los datos en la vista
        txtNombre.setText(nombre);
        txtTipo.setText(tipo);
        txtDescripcion.setText(descripcion);
        imgDino.setImageResource(imagen);
    }
}
