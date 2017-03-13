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

}
