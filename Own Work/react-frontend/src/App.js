
import './App.css';
import MovieList from './components/MovieList/MovieList';
import MovieAdd from './components/MovieAdd/MovieAdd';

function App() {
  return (
    <>
    <h2 className='title'>List of Movies</h2>
    <h3 className='underTitle'> <b>Movie Title</b><br/> Genre | Director</h3>
    <MovieList />
    <MovieAdd />
    </>
  );
}

export default App;
