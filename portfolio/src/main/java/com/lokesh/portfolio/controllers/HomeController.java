package com.lokesh.portfolio.controllers;

import com.lokesh.portfolio.beans.Movie;
import com.lokesh.portfolio.service.impl.MovieServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import ;

@RestController
public class HomeController {

    @Autowired
    MovieServImpl msi;


    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/movie")
    public ResponseEntity<Movie> fetchById(){
        return new ResponseEntity<>(msi.fetchMovie("lokk"), HttpStatusCode.valueOf(201));
        //return msi.fetchMovie("lokk");
    }
}
