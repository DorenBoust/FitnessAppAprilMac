package com.example.fitnessapp.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fitnessapp.R;
import com.example.fitnessapp.keys.KeysIntents;
import com.example.fitnessapp.user.ExerciseFullHistory;
import com.example.fitnessapp.user.ListExHistory;
import com.google.gson.Gson;
import com.ramotion.foldingcell.FoldingCell;

public class FitnessHistoryMainActivity extends AppCompatActivity {

    private ListExHistory listOFExerciseFullHistory;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_history_main);

        Intent intent = getIntent();
        Gson gson = new Gson();
        String stringExtra = intent.getStringExtra(KeysIntents.SEND_HISTORY_EXERCISE);
        listOFExerciseFullHistory = gson.fromJson(stringExtra, ListExHistory.class);

        recyclerView = findViewById(R.id.recyclerview_fitness_history);


    }


}
