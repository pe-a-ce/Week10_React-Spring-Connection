package com.example.moviesreactbackend.Movies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;


class MovieRepositoryTest {

    MovieRepository movieRepository = new MovieRepository();


    @Test
    void getAll() {
        assertEquals(20, movieRepository.getAll().size());
    }
    @Test
    void get() {
        assertEquals("Bring The Soul", movieRepository.get(7L).getTitle());
    }
    @Test
    void add() {
        assertEquals(20, movieRepository.getAll().size());
        var title = "Test Title";
        var genre = "Genre";
        var director = "Director";
        movieRepository.add(new Movies(1L, "Test Title", "Genre", "Director")); assertAll(
                () -> assertEquals(21, movieRepository.getAll().size()),
                () -> assertEquals(title, movieRepository.get(21L).getTitle()),
                ()-> assertEquals(genre, movieRepository.get(21L).getGenre()),
                ()-> assertEquals(director, movieRepository.get(21L).getDirector())
        ); }
    @Test

    void delete() {
        assertEquals(20, movieRepository.getAll().size());
        movieRepository.delete(1L);
        assertEquals(19, movieRepository.getAll().size());
    }
    @Test
    void deleteWithNonExistingId() {
        NoSuchElementException thrown = Assertions.assertThrows(NoSuchElementException.class, () -> movieRepository.delete(999L));
    }


}