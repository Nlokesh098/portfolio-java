package com.lokesh.portfolio.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cast {

    private String actor;

    private String actress;

    private List<String> supporting;

}

