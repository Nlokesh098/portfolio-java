package com.lokesh.portfolio.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;   // Primary key

    @Column(nullable = false)
    private String name;

    private String year;

    private String language;

    private String director;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cast> castAndCrew;

    //constructor:
    public Movie(String name, String year, String language, String director, List<Cast> castAndCrew) {
        this.name = name;
        this.year = year;
        this.language = language;
        this.director = director;
        this.castAndCrew = castAndCrew;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getLanguage() {
        return language;
    }

    public String getDirector() {
        return director;
    }

    public List<Cast> getCastAndCrew() {
        return castAndCrew;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCastAndCrew(List<Cast> castAndCrew) {
        this.castAndCrew = castAndCrew;
    }


}

