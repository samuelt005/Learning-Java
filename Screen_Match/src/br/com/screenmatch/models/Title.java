package br.com.screenmatch.models;

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

    //Other Methods
    public void evaluate(double n) {
        ratingSum += n;
        amountOfScores++;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getReleaseDate() + ")";
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
