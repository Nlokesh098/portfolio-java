package com.lokesh.portfolio.beans;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie_cast")
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Primary key

    private String actor;

    private String actress;

    @ElementCollection
    @CollectionTable(name = "supporting_cast", joinColumns = @JoinColumn(name = "cast_id"))
    @Column(name = "supporting_actor")
    private List<String> supporting;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

}

