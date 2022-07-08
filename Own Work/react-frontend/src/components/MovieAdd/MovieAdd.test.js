import React from 'react';
import ReactDOM from 'react-dom';
import MovieAdd from './MovieAdd';

it('It should mount', () => {
  const div = document.createElement('div');
  ReactDOM.render(<MovieAdd />, div);
  ReactDOM.unmountComponentAtNode(div);
});