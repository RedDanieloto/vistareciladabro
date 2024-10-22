package com.example.recycleview.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.DinosaurioDetailActivity;
import com.example.recycleview.R;
import com.example.recycleview.models.Dinosaurio;

import java.util.List;

public class DinosaurioAdapter extends RecyclerView.Adapter<DinosaurioAdapter.DinosaurioViewHolder> {
    private List<Dinosaurio> dinosauriosLista;

    // Constructor para recibir la lista de dinosaurios
    public DinosaurioAdapter(List<Dinosaurio> dinosauriosLista) {
        this.dinosauriosLista = dinosauriosLista;
    }

    @NonNull
    @Override
    public DinosaurioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflar la vista del itemdino.xml
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemdino, parent, false);
        return new DinosaurioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DinosaurioViewHolder holder, int position) {
        // Asignar los datos a cada ViewHolder
        holder.setData(dinosauriosLista.get(position));

        // Configurar el OnClickListener para abrir DinosaurioDetailActivity
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), DinosaurioDetailActivity.class);
            Dinosaurio dino = dinosauriosLista.get(position);
            intent.putExtra("nombre", dino.getNombre());
            intent.putExtra("tipo", dino.getTipo());
            intent.putExtra("descripcion", dino.getDescripcion());
            intent.putExtra("imagen", dino.getImagen());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        // Retornar el tamaño de la lista
        return dinosauriosLista.size();
    }

    // ViewHolder para manejar los elementos individuales de cada dinosaurio
    public class DinosaurioViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre, txtTipo, txtDescripcion;
        ImageView imgDino;

        public DinosaurioViewHolder(@NonNull View itemView) {
            super(itemView);
            // Inicializar los elementos del layout itemdino.xml
            txtNombre = itemView.findViewById(R.id.txtnombre);
            txtTipo = itemView.findViewById(R.id.txttipo);
            txtDescripcion = itemView.findViewById(R.id.txtdescripcion);
            imgDino = itemView.findViewById(R.id.imgdino);
        }

        public void setData(Dinosaurio dinosaurio) {
            // Asignar los valores a los TextView e ImageView
            txtNombre.setText(dinosaurio.getNombre());
            txtTipo.setText(dinosaurio.getTipo());
            txtDescripcion.setText(dinosaurio.getDescripcion());
            imgDino.setImageResource(dinosaurio.getImagen());
        }
    }
}
