package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmManager filmManager;

    String film1 = "film1";
    String film2 = "film2";
    String film3 = "film3";
    String film4 = "film4";
    String film5 = "film5";
    String film6 = "film6";

    @BeforeEach
    public void setup() {
        filmManager = new FilmManager();
        filmManager.add(film1);
        filmManager.add(film2);
        filmManager.add(film3);
    }

    @Test
    public void shouldAddFilms() {
        String[] expected = {film1, film2, film3};
        String[] actual = filmManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLast5Films() {

        filmManager.add(film4);
        filmManager.add(film5);
        filmManager.add(film6);
        String[] expected = {film6, film5, film4, film3, film2};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLast3Films() {
        filmManager = new FilmManager(3);
        filmManager.add(film1);
        filmManager.add(film2);
        filmManager.add(film3);
        filmManager.add(film4);
        filmManager.add(film5);
        filmManager.add(film6);
        String[] expected = {film6, film5, film4};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllLastFilms() {
        filmManager = new FilmManager(4);
        filmManager.add(film1);
        filmManager.add(film2);
        filmManager.add(film3);
        String[] expected = {film3, film2, film1};
        String[] actual = filmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
