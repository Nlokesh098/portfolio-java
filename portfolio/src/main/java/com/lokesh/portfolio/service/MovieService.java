package com.lokesh.portfolio.service;

import com.lokesh.portfolio.beans.Cast;
import com.lokesh.portfolio.beans.Movie;

import java.util.List;

public interface MovieService {

    Movie fetchMovie(String name);

    List<List<Cast>> fetchByName(String name);


}
