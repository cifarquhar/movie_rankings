package com.codeclan.movies;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 13/03/2017.
 */

public class MovieTest {

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
        movie1 = new Movie("Star Wars","Sci-Fi");
        movie2 = new Movie("The Godfather","Gangster");
        movie3 = new Movie("Saving Private Ryan","War");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Star Wars",movie1.getTitle());
    }

    @Test
    public void canSetTitle(){
        movie1.setTitle("Star Trek");
        assertEquals("Star Trek",movie1.getTitle());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Sci-Fi",movie1.getGenre());
    }

    @Test
    public void canSetGenre(){
        movie1.setGenre("Comedy");
        assertEquals("Comedy",movie1.getGenre());
    }

}
