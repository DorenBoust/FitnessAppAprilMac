package com.example.fitnessapp.articals;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnessapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

public class RecipeRecyclerAdapter extends RecyclerView.Adapter<RecipeRecyclerAdapter.RecipeHolder> {

    private Recipes recpies;
    private LayoutInflater inflater;

    public RecipeRecyclerAdapter(Recipes recpies, LayoutInflater inflater) {
        this.recpies = recpies;
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public RecipeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.recipe_fragment_layout, parent,false);
        return new RecipeHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeHolder holder, int position) {

        Recpie recpie = recpies.getRecipes().get(position);

        Picasso.get().load(recpie.getMainImage()).into(holder.recipeImage);
        holder.recipeTitle.setText(recpie.getName());
        holder.recipeTime.setText(recpie.getEstTime());
        holder.recipeLevel.setText(recpie.getLevel());

    }

    @Override
    public int getItemCount() {
        return recpies.getRecipes().size();
    }

    public class RecipeHolder extends RecyclerView.ViewHolder{

        ImageView recipeImage;
        TextView recipeTitle;
        TextView recipeTime;
        TextView recipeLevel;

        public RecipeHolder(@NonNull View itemView) {
            super(itemView);

            recipeImage = itemView.findViewById(R.id.recpie_image);
            recipeTitle = itemView.findViewById(R.id.recpie_title_tv);
            recipeTime = itemView.findViewById(R.id.recpie_time_tv);
            recipeLevel = itemView.findViewById(R.id.recpie_level);


        }
    }
}
