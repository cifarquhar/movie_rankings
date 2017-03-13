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



    @Before
    public void Before(){
        movie1 = new Movie("Star Wars","Sci-Fi",1);
        movie2 = new Movie("The Godfather","Gangster",2);
        movie3 = new Movie("Saving Private Ryan","War",3);
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

    @Test
    public void canGetRanking(){
        assertEquals(1,movie1.ranking);
    }

    @Test
    public void canSetRanking(){
        movie1.setRanking(4);
        assertEquals(4,movie1.ranking);
    }

    @Test
    public void canOverrideToStringMethod(){
        assertEquals("Title: Star Wars, Genre: Sci-Fi, Ranking: 1",movie1.toString());
    }


}
