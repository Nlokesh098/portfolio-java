package com.lokesh.portfolio.service.impl;


import com.lokesh.portfolio.beans.Cast;
import com.lokesh.portfolio.beans.Movie;
import com.lokesh.portfolio.service.MovieService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class MovieServImpl implements MovieService {


    @Override
    public Movie fetchMovie(String name) {
        Movie mv = new Movie();
        mv.setId(1);
        mv.setName("titanic");
        mv.setDirector("JC");
        Cast ct = new Cast();
        ct.setActor("leo");
        ct.setActress("leo1");
        ct.setSupporting(List.of("loki", "sai"));
        mv.setCastAndCrew(List.of(ct));
        return mv;
    }
}
