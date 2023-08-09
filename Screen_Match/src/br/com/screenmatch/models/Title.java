package br.com.screenmatch.models;

import br.com.screenmatch.exceptions.ConversionException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    //Atributes
    private String name;
    private int releaseDate;
    private boolean planIncluded;
    private double ratingSum;
    private int amountOfScores;
    private int durationInMinutes;

    //Constructor
    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public Title(OmdbTitle omdbTitle) {
        this.name = omdbTitle.title();
        if (omdbTitle.year().length() > 4) {
            throw new ConversionException("Não foi possível converter o ano " +
                    "por ter mais de 4 caracteres!");
        }
        this.releaseDate = Integer.valueOf(omdbTitle.year());
        this.durationInMinutes = Integer.valueOf(omdbTitle.runtime().substring(0,2));
    }

    //Other Methods
    public void evaluate(double n) {
        ratingSum += n;
        amountOfScores++;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getReleaseDate() + ")" + " - Duração: " + this.getDurationInMinutes();
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getName().compareTo(anotherTitle.getName());
    }

    //Getter Methods
    double getRating() {
        return getRatingSum() / getAmountOfScores();
    };

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    String isPlanIncluded() {
        if (planIncluded) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    private double getRatingSum() {
        return ratingSum;
    }

    public int getAmountOfScores() {
        return amountOfScores;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    //Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void setRatingSum(double ratingSum) {
        this.ratingSum = ratingSum;
    }

    public void setAmountOfScores(int amountOfScores) {
        this.amountOfScores = amountOfScores;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
