import React, { Component } from 'react';
import { hot } from 'react-hot-loader';

const Greeter = props => (
  <h2>Hello {props.name}</h2>
);

class App extends Component {
  render() {
    return(
      <div className="App">
        <Greeter name="Steven" />
      </div>
    );
  }
}

export default hot(module)(App);
