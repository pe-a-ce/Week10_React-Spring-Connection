package com.example.moviesreactbackend.Movies;


import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/movie")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {


    private MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    Collection<Movies> getAll() {
        return movieRepository.getAll();
    }
    @GetMapping("/{id}")
    Movies get(@PathVariable Long id) {
        return movieRepository.get(id); }

    @PostMapping()
    void create(@RequestBody Movies movies) {
        movieRepository.add(movies); }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        movieRepository.delete(id); }
}
