package com.devsuperior.uri2611.dtos;

import com.devsuperior.uri2611.projections.MovieProjection;

public class MovieMinDTO {

    private Long id;
    private String name;

    public MovieMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MovieMinDTO(MovieProjection projection) {
        id = projection.getId();
        name = projection.getName();    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MovieMinDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
