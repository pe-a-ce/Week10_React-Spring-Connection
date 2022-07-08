package com.example.moviesreactbackend.Movies;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MovieRepository {


    private Map<Long, Movies> map = new HashMap();

    {

        map.put(1L, new Movies(1L, "Shattered Glass", "Drama", "Lindsay Bilbie"));
        map.put(2L, new Movies(2L, "Pink Panther Strikes Again, The", "Comedy", "Sanderson Blaylock"));
        map.put(3L, new Movies(3L, "Holcroft Covenant, The", "Thriller", "Elvina Gearing"));
        map.put(4L, new Movies(4L, "Hound of the Baskervilles, The", "Drama", "Lindsay Bilbie"));
        map.put(5L, new Movies(5L, "Garden State", "Adventure", "Mame Entwhistle"));
        map.put(6L, new Movies(6L, "Father of Invention", "Drama", "Elvina Gearing"));
        map.put(7L, new Movies(7L, "Bring The Soul", "Documentary", "Sihyuk Bang"));
        map.put(8L, new Movies(8L, "Element of Crime, The", "Adventure", "Devan Beardsell"));
        map.put(9L, new Movies(9L, "Break The Silence", "Documentary", "Fletch Hukin"));
        map.put(10L, new Movies(10L, "Circle of Iron", "Drama", "Steven Spielberg"));
        map.put(11L, new Movies(11L, "Prisoner of Zenda, The", "Thriller", "Garreth Glavin"));
        map.put(12L, new Movies(12L, "Adventures of Baron Munchausen, The", "Adventure", "Orsola Pellatt"));
        map.put(13L, new Movies(13L, "Phish: Bittersweet Motel", "Drama", "Kandy Pendre"));
        map.put(14L, new Movies(14L, "Congress, The", "Drama", "Orsola Pellatt"));
        map.put(15L, new Movies(15L, "Red Badge of Courage, The", "Comedy", "Kathy Dunniom"));
        map.put(16L, new Movies(16L, "Rush Hour 1", "Adventure", "Lindsay Bilbie"));
        map.put(17L, new Movies(17L, "Rush Hour 2", "Drama", "Steven Spielberg"));
        map.put(18L, new Movies(18L, "Rush Hour  3", "Comedy", "Steven Spielberg"));
        map.put(19L, new Movies(19L, "Men in Black", "Horror", "Neile Ruckhard"));
        map.put(20L, new Movies(20L, "Karate Kid", "Drama", "Lindsay Bilbie"));

    }

    public Collection<Movies> getAll() {

        return map.values();
    }

    public Movies get(Long id){
        return map.get(id);
    }

    public void add(Movies movies){
        var nextId = Long.valueOf(map.size()+1); movies.setId(nextId);
        map.put(nextId, movies);
    }

    public void delete(Long id){
        if(!map.containsKey(id)) {
            throw new NoSuchElementException("No element exists with given id: " + id + ". Please try again!"); }
        map.remove(id); }
    }



