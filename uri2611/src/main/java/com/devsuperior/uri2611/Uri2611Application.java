package com.devsuperior.uri2611;

import com.devsuperior.uri2611.dtos.MovieMinDTO;
import com.devsuperior.uri2611.projections.MovieProjection;
import com.devsuperior.uri2611.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Uri2611Application implements CommandLineRunner {


	@Autowired
	private MovieRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2611Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		List<MovieProjection> movieProjections = repository.search1("Action");
		List<MovieMinDTO> movieDTO = movieProjections.stream().map(MovieMinDTO::new).collect(Collectors.toList());*/

		List<MovieMinDTO> dto = repository.search2("Action");

		for (MovieMinDTO dtoObj : dto) {
			System.out.println(dtoObj + "\n");
		}


	}
}
