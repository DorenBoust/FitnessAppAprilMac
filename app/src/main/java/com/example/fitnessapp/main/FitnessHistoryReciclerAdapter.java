package com.example.fitnessapp.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnessapp.R;
import com.example.fitnessapp.user.ExerciseFullHistory;
import com.example.fitnessapp.user.ExerciseHistory;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FitnessHistoryReciclerAdapter extends RecyclerView.Adapter<FitnessHistoryReciclerAdapter.HistoryHolder> {


    private LayoutInflater layoutInflater;
    private List<ExerciseFullHistory> exerciseFullHistoryList;

    public FitnessHistoryReciclerAdapter(LayoutInflater layoutInflater, List<ExerciseFullHistory> exerciseFullHistoryList) {
        this.layoutInflater = layoutInflater;
        this.exerciseFullHistoryList = exerciseFullHistoryList;
    }

    @NonNull
    @Override
    public HistoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = layoutInflater.inflate(R.layout.recyclerview_fitness_history_foldingcell, parent, false );
        return new HistoryHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryHolder holder, int position) {

        ExerciseFullHistory exerciseFullHistory = exerciseFullHistoryList.get(position);

        holder.layer1ExName.setText(exerciseFullHistory.getExName());
        holder.layer1FinalDate.setText(exerciseFullHistory.getLastDateUpdate());
//        Picasso.get().load(exerciseFullHistory.getExImage()).into(holder.layer1exImage);

    }

    @Override
    public int getItemCount() {
        return exerciseFullHistoryList.size();
    }

    public class HistoryHolder extends RecyclerView.ViewHolder {

        private TextView layer1FinalDate;
        private TextView layer1ExName;
        private ImageView layer1exImage;

        public HistoryHolder(@NonNull View itemView) {
            super(itemView);

            layer1FinalDate = itemView.findViewById(R.id.tv_final_date_history);
            layer1exImage = itemView.findViewById(R.id.iv_ex_image_history);
            layer1ExName = itemView.findViewById(R.id.tv_ex_name_history);

        }
    }
}
