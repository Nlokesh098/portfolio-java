package com.lokesh.portfolio.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Movie {

    private int id;

    private String name;

    private String year;

    private String language;

    private String director;

    private List<Cast> castAndCrew;

}

