package br.com.screenmatch.models;

public class Title {
    //Atributes
    private String name;
    private int releaseDate;
    private boolean planIncluded;
    private double ratingSum;
    private int amountOfScores;
    private int durationInMinutes;

    //Other Methods


    public void evaluate(double n) {
        ratingSum += n;
        amountOfScores++;
    }

    //Getter Methods
    double getRating() {
        return getRatingSum() / getAmountOfScores();
    };

    String getName() {
        return name;
    }

    int getReleaseDate() {
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

    int getAmountOfScores() {
        return amountOfScores;
    }

    int getDurationInMinutes() {
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
