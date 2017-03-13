package com.codeclan.movies;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 13/03/2017.
 */

public class RankingsTest {

    Rankings movieRankings;
    Movie movie1;


    @Before
    public void Before(){
        movieRankings = new Rankings();
        movie1 = new Movie("Star Wars","Sci-Fi",1);
    }

//    @Test
//    public void newListNotEmpty(){
//        assertNotNull(movieRankings.movies.get(0));
//    }
//
//    @Test
//    public void canFindMovieRanking(){
//
//    }

}
