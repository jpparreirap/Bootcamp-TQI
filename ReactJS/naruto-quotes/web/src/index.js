import React from 'react';
import ReactDOM from 'react-dom/client';
import { GlobalStyle } from './assets/components'
import { App } from './assets/pages/app/App';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <GlobalStyle />
    <App />
  </React.StrictMode>,
);

// ReactDOM.render(
//   <React.StrictMode>
//     <GlobalStyle />
//     <App />
//   </React.StrictMode>,
//   document.getElementById('root')
// );