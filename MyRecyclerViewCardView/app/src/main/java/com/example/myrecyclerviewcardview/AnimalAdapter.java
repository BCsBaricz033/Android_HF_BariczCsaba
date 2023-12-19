package com.example.myrecyclerviewcardview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// AnimalAdapter.java
public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    private List<Animal> animalList;
    private Context context;

    public AnimalAdapter(List<Animal> animalList, Context context) {
        this.animalList = animalList;
        this.context = context;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal, parent, false);
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animalList.get(position);

        holder.imageAnimal.setImageResource(animal.getImageResId());
        holder.textAnimalName.setText(animal.getName());
        holder.textAverageAge.setText("Average Age: " + animal.getAverageAge());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, animal.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    static class AnimalViewHolder extends RecyclerView.ViewHolder {
        ImageView imageAnimal;
        TextView textAnimalName, textAverageAge;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            imageAnimal = itemView.findViewById(R.id.imageAnimal);
            textAnimalName = itemView.findViewById(R.id.textAnimalName);
            textAverageAge = itemView.findViewById(R.id.textAverageAge);
        }
    }
}

