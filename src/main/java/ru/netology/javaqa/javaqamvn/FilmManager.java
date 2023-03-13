package ru.netology.javaqa.javaqamvn;

public class FilmManager {
    private String[] films;
    private int limit;

    public FilmManager() {
        films = new String[0];
        limit = 5;
    }

    public FilmManager(int limit) {
        films = new String[0];
        this.limit = limit;
    }

    public void add(String name) {
        String[] temp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            temp[i] = films[i];
        }
        temp[temp.length - 1] = name;
        films = temp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length > limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}
