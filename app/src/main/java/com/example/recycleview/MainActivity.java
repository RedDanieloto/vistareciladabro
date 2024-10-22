package com.example.recycleview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recycleview.adapter.DinosaurioAdapter;
import com.example.recycleview.models.Dinosaurio;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerDino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerDino = findViewById(R.id.recyclerDino);

        List<Dinosaurio> dinosaurioLista = new ArrayList<>();
        dinosaurioLista.add(new Dinosaurio("T-rex", "Carnívoro", "El Dinosaurio mas famoso de todos", "Verde", R.drawable.images));
        dinosaurioLista.add(new Dinosaurio("Danisito", "Carnívoro", "Ese soy yo", "Verde", R.drawable.images));
        dinosaurioLista.add(new Dinosaurio("Pterodactilo", "Carnívoro", "El dinosaurio Volador", "Verde", R.drawable.images));
        dinosaurioLista.add(new Dinosaurio("Triseraptor", "Herviboro", "El dinosaurio de la tierra", "Verde", R.drawable.images));
        dinosaurioLista.add(new Dinosaurio("Pachyensefalosaurio", "Herviboro", "Es un dinosaurio radar", "Verde", R.drawable.images));

        DinosaurioAdapter adapter = new DinosaurioAdapter(dinosaurioLista);
        recyclerDino.setAdapter(adapter);
        recyclerDino.setLayoutManager(new LinearLayoutManager(this));
        recyclerDino.setHasFixedSize(true);
    }
}
