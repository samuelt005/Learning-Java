package br.com.screenmatch.main;

import br.com.screenmatch.calculations.RecomendationFilter;
import br.com.screenmatch.calculations.TimeCalculation;
import br.com.screenmatch.models.Episodes;
import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Series;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //Instanced Movies
        Movie theGodfather = new Movie("O Poderoso Chefão", 1972);
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


        Movie interstellar = new Movie("Interstellar", 2014);
        interstellar.setDurationInMinutes(169);
        interstellar.setPlanIncluded(true);
        interstellar.setDirector("Christopher Nolan");

        interstellar.evaluate(9);
        interstellar.evaluate(9);
        interstellar.evaluate(7);
        interstellar.evaluate(8);
        interstellar.evaluate(10);

        interstellar.showDatasheet();
        System.out.println();


        Movie rambo = new Movie("Rambo", 1982);
        rambo.setDurationInMinutes(97);
        rambo.setPlanIncluded(true);
        rambo.setDirector("Ted Kotcheff");

        rambo.evaluate(10);
        rambo.evaluate(7);
        rambo.evaluate(9);
        rambo.evaluate(5);
        rambo.evaluate(8);

        rambo.showDatasheet();
        System.out.println();

        //Instanced Series
        Series lost = new Series("Lost", 2004);
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

        //Instanced Episodes
        Episodes episode = new Episodes();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setName("Pilot (Part 1)");
        episode.setTotalViews(300);


        //Calculate total marathon time
        TimeCalculation calculator = new TimeCalculation();
        calculator.sumTotalTime(theGodfather);
        calculator.sumTotalTime(interstellar);
        calculator.sumTotalTime(lost);
        System.out.println("Total de minutos para maratonar os títulos: " + calculator.getTotalTime());
        System.out.println();

        //Filtering stuff
        RecomendationFilter filter = new RecomendationFilter();
        System.out.println(theGodfather.getName() + ": ");
        filter.filter(theGodfather);
        System.out.println();

        System.out.println(interstellar.getName() + ": ");
        filter.filter(interstellar);
        System.out.println();

        System.out.println(lost.getName() + ": ");
        filter.filter(episode);
    }
}