package br.com.mysongs.main;

import br.com.mysongs.models.Favorites;
import br.com.mysongs.models.Podcast;
import br.com.mysongs.models.Song;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("Fuel");
        song1.setSinger("Metallica");

        for (int i = 0; i < 1000; i++) {
            song1.play();
        }

        for (int i = 0; i < 50; i++) {
            song1.like();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitle("BolhaDev");
        podcast1.setHost("Marcus Mendes");

        for (int i = 0; i < 800; i++) {
            podcast1.play();
        }

        for (int i = 0; i < 20; i++) {
            podcast1.like();
        }

        Favorites favorites = new Favorites();
        favorites.include(song1);
        favorites.include(podcast1);
    }
}
