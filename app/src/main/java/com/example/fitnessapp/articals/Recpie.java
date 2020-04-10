package com.example.fitnessapp.articals;

import java.util.Arrays;
import java.util.List;

public class Recpie {

    private String id;
    private String name;
    private String sentencePreview;
    private String estTime;
    private List<String> forWhoGoal;
    private String mainImage;
    private List<RecpieProduct> product;
    private RecpieSteps steps;

    public Recpie(String id, String name, String sentencePreview, String estTime, List<String> forWhoGoal, String mainImage, List<RecpieProduct> product, RecpieSteps steps) {
        this.id = id;
        this.name = name;
        this.sentencePreview = sentencePreview;
        this.estTime = estTime;
        this.forWhoGoal = forWhoGoal;
        this.mainImage = mainImage;
        this.product = product;
        this.steps = steps;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSentencePreview() {
        return sentencePreview;
    }

    public void setSentencePreview(String sentencePreview) {
        this.sentencePreview = sentencePreview;
    }

    public String getEstTime() {
        return estTime;
    }

    public void setEstTime(String estTime) {
        this.estTime = estTime;
    }

    public List<String> getForWhoGoal() {
        return forWhoGoal;
    }

    public void setForWhoGoal(List<String> forWhoGoal) {
        this.forWhoGoal = forWhoGoal;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public List<RecpieProduct> getProduct() {
        return product;
    }

    public void setProduct(List<RecpieProduct> product) {
        this.product = product;
    }

    public RecpieSteps getSteps() {
        return steps;
    }

    public void setSteps(RecpieSteps steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "Recpie{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sentencePreview='" + sentencePreview + '\'' +
                ", estTime='" + estTime + '\'' +
                ", forWhoGoal=" + forWhoGoal +
                ", mainImage='" + mainImage + '\'' +
                ", product=" + product +
                ", steps=" + steps +
                '}';
    }
}