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
            if (i == ranking) {
                return movies.get(i);
            }
        }
        return null;
    }




}
