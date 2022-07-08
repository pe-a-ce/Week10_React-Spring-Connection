import React from 'react';

import { useState } from 'react';
import axios from 'axios';
import './MovieAdd.css';


const MovieAdd = () => {
  const [title, setTitle] = useState('');
  const [genre, setGenre] = useState('');
  const [director, setDirector] = useState('');

  const handleTitleChange = event => setTitle(event.target.value);
  const handleGenreChange = event => setGenre(event.target.value);
  const handleDirectorChange = event => setDirector(event.target.value);
  const handleSubmit = event => {
    event.preventDefault();
    const movie = {
    "title": title,
    "genre": genre,
    "director": director
  }
 
  axios.post('http://127.0.0.1:8080/movie', movie)
  .then(res => {
  console.log(res);
  }).catch((err) => console.log(err));
}
 return (
 <div>
 <form onSubmit={handleSubmit}>
 <label>
 Title:
 <input type="text" name="title" onChange={handleTitleChange} />
 </label>

<label>
  Genre:
  <input type="text" name="genre" onChange={handleGenreChange} />
</label>

 <label>
 Director:
 <input type="text" name="author" onChange={handleDirectorChange} />
 </label>
 <button type="submit">Add</button>
 </form>
 </div>
 ); }

export default MovieAdd;
