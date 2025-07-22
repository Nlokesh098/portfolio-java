package com.lokesh.portfolio.controllers;

import com.lokesh.portfolio.beans.Cast;
import com.lokesh.portfolio.beans.Movie;
import com.lokesh.portfolio.service.impl.MovieServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @GetMapping("/byName")
    public String getByNames(@RequestParam String name){
        //System.out.println("reqparam val:" + name);
        return msi.fetchByName("titanic");
    }

    @PostMapping("/movieEntry")
    public ResponseEntity<Void> entryMovie(@RequestBody List<Movie> movieListBody){
        System.out.println("entry point");
        msi.movieEntry(movieListBody);
        return new ResponseEntity<>(HttpStatusCode.valueOf(201));
    }

    @PostMapping("/samplepost")
    public String samplePost(){
        return "Lokesh";
    }
}
