package ru.netology.poster;

public class PosterManager {
    private String[] posters = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void addPoster(String poster) {
        String[] result = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            result[i] = posters[i];
        }
        result[result.length - 1] = poster;
        posters = result;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findLast() {
        int resultLength;
        if (posters.length < 10) {
            resultLength = posters.length;
        } else {
            resultLength = 10;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }
}
