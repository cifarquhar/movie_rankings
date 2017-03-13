package com.codeclan.movies;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 13/03/2017.
 */

public class RankingsTest {

    Rankings movieRankings;
    ArrayList<Movie> movieList;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;


    @Before
    public void Before(){
        movieList = new ArrayList<Movie>();
        movie1 = new Movie("Star Wars","Sci-Fi",1);
        movie2 = new Movie("The Godfather","Gangster",2);
        movie3 = new Movie("Saving Private Ryan","War",3);
        movie4 = new Movie("28 Days Later","Horror",4);
        movie5 = new Movie("Toy Story","Animated",5);
        movie6 = new Movie("Raiders of the Lost Ark","Adventure",6);
        movie7 = new Movie("The Lego Movie","Animated",7);
        movie8 = new Movie("Batman","Action",8);
        movie9 = new Movie("Fight Club","Action",9);
        movie10 = new Movie("The Great Escape","War",10);
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
        movieList.add(movie7);
        movieList.add(movie8);
        movieList.add(movie9);
        movieList.add(movie10);
        movieRankings = new Rankings(movieList);
    }

    @Test
    public void newListNotEmpty(){
        assertNotNull(movieRankings.movies.get(0));
    }

    @Test
    public void canFindMovieByRanking(){
        Movie testMovie = movieRankings.findByRank(1);
        assertEquals("Star Wars",testMovie.getTitle());

    }

    @Test
    public void canAddNewMovie(){
        Movie replacementMovie = new Movie("Iron Man","Superhero",10);
        movieRankings.addNewMovie(replacementMovie);
        Movie checkMovie = movieRankings.findByRank(10);
        assertEquals("Iron Man",checkMovie.getTitle());

    }

}
