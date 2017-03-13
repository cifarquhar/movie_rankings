package com.codeclan.movies;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 13/03/2017.
 */

public class RankingsTest {

    Rankings movieRankings;


    @Before
    public void Before(){
        movieRankings = new Rankings();
    }

    @Test
    public void newListNotEmpty(){
        assertNotNull(movieRankings.movies.get(0));
    }

}
