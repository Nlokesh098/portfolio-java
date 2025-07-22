package com.lokesh.portfolio.service.impl;


import com.lokesh.portfolio.beans.Cast;
import com.lokesh.portfolio.beans.Movie;
import com.lokesh.portfolio.service.MovieService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieServImpl implements MovieService {

    List<Movie> MovieList = new ArrayList<>();

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

    @Override
    public String fetchByName(String name){
        Movie mv1 = fetchMovie("titanic");
//        List<String> al = new ArrayList<>();
//        al.add(mv1.getDirector());
        return mv1.getDirector();
    }

    @Override
    public void movieEntry(List<Movie> movieListBody) {
        if(!movieListBody.isEmpty()){
            for(int i =0;i<movieListBody.size();i++) {
                    MovieList.add(movieListBody.get(i));
            }
        }
    }


}
