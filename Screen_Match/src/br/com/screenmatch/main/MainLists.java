package br.com.screenmatch.main;

import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Series;
import br.com.screenmatch.models.Title;

import java.util.*;

public class MainLists {
    public static void main(String[] args) {
        Movie theGodfather = new Movie("O Poderoso Chefão", 1972);
        theGodfather.evaluate(9);
        Movie interstellar = new Movie("Interstellar", 2014);
        interstellar.evaluate(10);
        Movie rambo = new Movie("Rambo", 1982);
        rambo.evaluate(8);
        Series lost = new Series("Lost", 2004);
        lost.evaluate(7);

        //Movies Array
        List<Title> watchedTitles = new ArrayList<>();
        watchedTitles.add(theGodfather);
        watchedTitles.add(interstellar);
        watchedTitles.add(rambo);
        watchedTitles.add(lost);

        for (Title item: watchedTitles) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassification() >= 3) {
                System.out.println("Classificação: " + movie.getClassification());
            }
            System.out.println();
        }
        

        System.out.println("Tamanho da lista: " + watchedTitles.size());
        System.out.println("Primeiro título da lista: " + watchedTitles.get(0).getName());
        System.out.println(watchedTitles);

        System.out.println();

        List<String> artistSearch = new ArrayList<>();
        artistSearch.add("Johnny Depp");
        artistSearch.add("Tom Holland");
        artistSearch.add("Adam Sandler");

        System.out.println(artistSearch);

        //Maneira convêncional de ordenação de listas String
        System.out.println();
        Collections.sort(artistSearch);
        System.out.println(artistSearch);

        //Modo de ordenação usando Override do método compareTo
        System.out.println();
        Collections.sort(watchedTitles);
        System.out.println("Lista de forma ordenada por nome:");
        System.out.println(watchedTitles);

        //Modo moderno de ordenação
        watchedTitles.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println();
        System.out.println("Lista de forma ordenada por data de lançamento:");
        System.out.println(watchedTitles);
    }
}
