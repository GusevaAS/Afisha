package ru.netology.poster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    PosterManager poster = new PosterManager();

    @Test
    void findAllPosters() {
        poster.addPoster("Poster1");
        poster.addPoster("Poster2");
        poster.addPoster("Poster3");
        poster.addPoster("Poster4");
        poster.addPoster("Poster5");
        poster.addPoster("Poster6");
        poster.addPoster("Poster7");
        poster.addPoster("Poster8");
        poster.addPoster("Poster9");
        poster.addPoster("Poster10");

        String[] expected = {"Poster1", "Poster2", "Poster3", "Poster4", "Poster5", "Poster6", "Poster7", "Poster8", "Poster9", "Poster10"};
        String[] actual = poster.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast10Poster() {
        poster.addPoster("Poster1");
        poster.addPoster("Poster2");
        poster.addPoster("Poster3");
        poster.addPoster("Poster4");
        poster.addPoster("Poster5");
        poster.addPoster("Poster6");
        poster.addPoster("Poster7");
        poster.addPoster("Poster8");
        poster.addPoster("Poster9");
        poster.addPoster("Poster10");

        String[] expected = {"Poster10", "Poster9", "Poster8", "Poster7", "Poster6", "Poster5", "Poster4", "Poster3", "Poster2", "Poster1"};
        String[] actual = poster.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast10PosterOverLimit() {
        poster.addPoster("Poster1");
        poster.addPoster("Poster2");
        poster.addPoster("Poster3");
        poster.addPoster("Poster4");
        poster.addPoster("Poster5");
        poster.addPoster("Poster6");
        poster.addPoster("Poster7");
        poster.addPoster("Poster8");
        poster.addPoster("Poster9");
        poster.addPoster("Poster10");
        poster.addPoster("Poster11");

        String[] expected = {"Poster11", "Poster10", "Poster9", "Poster8", "Poster7", "Poster6", "Poster5", "Poster4", "Poster3", "Poster2"};
        String[] actual = poster.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastPosterMinLimit() {
        poster.addPoster("Poster1");

        String[] expected = {"Poster1"};
        String[] actual = poster.findLast();
        assertArrayEquals(expected, actual);
    }
}