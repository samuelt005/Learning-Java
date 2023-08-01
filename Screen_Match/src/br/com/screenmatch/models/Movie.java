package br.com.screenmatch.models;

public class Movie extends Title {
    //Atributes specific for titles
    private String director;

    //Other Methods
    public void showDatasheet() {
        System.out.println("Nome do filme: " + getName());
        System.out.println("Ano do lançamento: " + getReleaseDate());
        System.out.println("Incluído no plano: " + isPlanIncluded());
        System.out.println("Avaliação média: " + getRating());
        System.out.println("Quantidade de avaliações: " + getAmountOfScores());
        System.out.println("Duração do filme: " + getDurationInMinutes() + " minutos");
    }

    //Getter Methods
    public String getDirector() {
        return director;
    }

    //Setter Methods
    public void setDirector(String director) {
        this.director = director;
    }
}
