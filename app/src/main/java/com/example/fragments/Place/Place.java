package com.example.fragments.Place;


public class Place {

    private String name;        // nome do local
    private Integer photoId;    // id da foto do local
    private Double distance;    // distância (em km)
    private Float rate;        // nota (1 a 5)
    private String description; // descricao do lugar

    public Place(String name, String description, Integer photoId, Double distance, Float rate) {
        this.name = name;
        this.description = description;
        this.photoId = photoId;
        this.distance = distance;
        this.rate = rate;
    }

    public Place() {
        this(null, null, null, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoName(Integer photoId) {
        this.photoId = photoId;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}