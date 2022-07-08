import { useState, useEffect } from 'react';
import axios from 'axios';
import './MovieList.css';

const MovieList = () => {
  
    const [movies, setMovies] = useState([]);

    useEffect(() => {
      axios.get('http://127.0.0.1:8080/movie')
    .then(res => {const movies = res.data; 
      setMovies(movies);})
    .catch((err)=> console.error(err));
  },[] 
    
    );
  
    return ( 
    <ul> 
      {
      movies.map(movie => 
      <li key={movie.id}>
       <b> {`${movie.title}`}</b> <br/>
        { `${movie.genre} | ${movie.director}`}
        
        
        {/* {`${movie.title} | ${movie.genre} | ${movie.director}` } */}
        <hr/>

      </li>)}
      </ul>
    
    );
    }
    
  

export default MovieList;
