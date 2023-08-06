package br.com.screenmatch.models;

public class Series extends Title {
    //Atributes specific for series
    private  int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerSeason;

    //Constructor
    public Series(String name, int releaseDate) {
        super(name, releaseDate);
    }

    //Override Methods
    @Override
    public int getDurationInMinutes() {
        return seasons * episodesPerSeason * minutesPerSeason;
    }

    //Other Methods
    public void showDatasheet() {
        System.out.println("Nome da serie: " + getName());
        System.out.println("Ano do lançamento: " + getReleaseDate());
        System.out.println("Incluído no plano: " + isPlanIncluded());
        System.out.println("Avaliação média: " + getRating());
        System.out.println("Quantidade de avaliações: " + getAmountOfScores());
        System.out.println("Duração do filme: " + getDurationInMinutes() + " minutos");
    }

    //Getter Methods
    public int getSeasons() {
        return seasons;
    }

    public boolean isActive() {
        return active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getMinutesPerSeason() {
        return minutesPerSeason;
    }

    //Setter Methods
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setMinutesPerSeason(int minutesPerSeason) {
        this.minutesPerSeason = minutesPerSeason;
    }
}
