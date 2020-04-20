package com.example.fitnessapp.user;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class NameOfAllExercieOnHistory implements Serializable {
    private List<String> allExNames;

    public NameOfAllExercieOnHistory(List<String> allExNames) {
        this.allExNames = allExNames;
    }

    public List<String> getAllExNames() {
        return allExNames;
    }

    public void setAllExNames(List<String> allExNames) {
        this.allExNames = allExNames;
    }

    @Override
    public String toString() {
        return "NameOfAllExercieOnHistory{" +
                "allExNames=" + allExNames +
                '}';
    }
}
