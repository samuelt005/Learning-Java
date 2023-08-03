package br.com.screenmatch.models;

import br.com.screenmatch.calculations.Classification;

public class Episodes implements Classification {
    //Attributes
    private int number;
    private String name;
    private Series series;
    private int totalViews;

    //Other Methods
    @Override
    public int getClassification() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    //Setter Methods
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Series getSeries() {
        return series;
    }

    public int getTotalViews() {
        return totalViews;
    }

    //Getter Methods
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }
}
