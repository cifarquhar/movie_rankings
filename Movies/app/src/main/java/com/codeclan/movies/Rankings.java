package com.codeclan.movies;

import java.util.ArrayList;

/**
 * Created by user on 13/03/2017.
 */

public class Rankings {

    ArrayList<Movie> movies;

    public Rankings(ArrayList<Movie> movieList){
        movies = new ArrayList<Movie>(movieList);
    }

    public Movie findByRank(int ranking){
        for (int i = 0; i < movies.size(); i++) {
            if (i == ranking - 1) {
                return movies.get(i);
            }
        }
        return null;
    }


    public void addNewMovie(Movie newMovie) {
        movies.remove(9);
        movies.add(newMovie);
    }

    public Movie findByTitle(String movieTitle) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).title == movieTitle) {
                return movies.get(i);
            }
        }
        return null;
    }

    public void moveUp(int rank) {
        Movie movieMovingUp = movies.get(rank - 1);
        Movie movieMovingDown = movies.get(rank - 2);
        movies.set(rank-1,movieMovingDown);
        movies.set(rank-2,movieMovingUp);
        movieMovingUp.setRanking(rank - 2);
        movieMovingDown.setRanking(rank - 1);
    }

    public void moveDown(int rank) {
        Movie movieMovingDown = movies.get(rank - 1);
        Movie movieMovingUp = movies.get(rank);
        movies.set(rank-1,movieMovingUp);
        movies.set(rank,movieMovingDown);
        movieMovingUp.setRanking(rank);
        movieMovingDown.setRanking(rank - 1);
    }
}
