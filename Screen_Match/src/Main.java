import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie theGodfather = new Movie();
        theGodfather.setName("O Poderoso Chefão");
        theGodfather.setReleaseDate(1972);
        theGodfather.setDurationInMinutes(175);
        theGodfather.setPlanIncluded(true);
        theGodfather.setDirector("Francis Ford Coppola");

        theGodfather.evaluate(5);
        theGodfather.evaluate(4);
        theGodfather.evaluate(7);
        theGodfather.evaluate(2);
        theGodfather.evaluate(9);

        theGodfather.showDatasheet();
        System.out.println();



        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseDate(2004);
        lost.setPlanIncluded(true);
        lost.setSeasons(6);
        lost.setEpisodesPerSeason(18);
        lost.setMinutesPerSeason(50);

        lost.evaluate(10);
        lost.evaluate(2);
        lost.evaluate(4);
        lost.evaluate(1);
        lost.evaluate(8);

        lost.showDatasheet();
        System.out.println();
    }
}