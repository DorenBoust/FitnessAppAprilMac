package com.example.fitnessapp.articals;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fitnessapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StepsTabOnRecipeActivityFragment extends Fragment {

    public StepsTabOnRecipeActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_steps_tab_on_recipe_activity, container, false);
    }
}
