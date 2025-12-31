package com.lokesh.portfolio.controllers;

import com.lokesh.portfolio.beans.Cast;
import com.lokesh.portfolio.beans.Movie;
import com.lokesh.portfolio.repo.MovieRepository;
import com.lokesh.portfolio.service.impl.MovieServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// import ;

@RestController
@RequestMapping("/api")
public class HomeController {

    // field injection is performed here, less preferred
//    @Autowired
//    MovieServImpl msi;


    private final MovieServImpl msi;
    public final MovieRepository mRepo;

    // constructor injection is performed here, most preferred.
    public HomeController(MovieServImpl msi, MovieRepository mRepo){
        this.msi = msi;
        this.mRepo = mRepo;
    }

    //setter injection is performed here.
//    private MovieServImpl msi;
//    @Autowired
//    public void setserv(MovieServImpl msi){
//        this.msi = msi;
//    }


    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping ("/movie")
    public ResponseEntity<List<Movie>> fetchById(){
        mRepo.findAll();
        return new ResponseEntity<>(mRepo.findAll(), HttpStatus.OK);
        //return msi.fetchMovie("lokk");
    }

    @GetMapping("/byName")
    public String getByNames(@RequestParam String name){
        //System.out.println("reqparam val:" + name);
        return msi.fetchByName("titanic");
    }

    @PostMapping("/movieEntry")
    public ResponseEntity<List<Movie>> entryMovie(@RequestBody List<Movie> movieListBody){
        List<Movie> savedMovies = mRepo.saveAll(movieListBody);
        return new ResponseEntity<>(savedMovies, HttpStatus.CREATED);
    }

    @PostMapping("/samplepost")
    public String samplePost(){
        return "Lokesh";
    }

//    @PostMapping("/entry")
//    public void entry(List<Movie> movieListBody){
//        msi.entry(movieListBody);
//        return new ResponseEntity<>(HttpStatusCode.valueOf(201));;
//    }
}
