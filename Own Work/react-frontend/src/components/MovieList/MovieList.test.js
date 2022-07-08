import React from 'react';
import ReactDOM from 'react-dom';
import MovieList from './MovieList';

it('It should mount', () => {
  const div = document.createElement('div');
  ReactDOM.render(<MovieList />, div);
  ReactDOM.unmountComponentAtNode(div);
});