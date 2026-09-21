/*
 * Platform: CodeChef
 * Problem ID: PREACT015
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT003/problems/PREACT015
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT003
 * Status: ACCEPTED
 */

function UserProfile(props) {
  return (
    <div>
      <h3>User Profile:</h3>
      <p>Name: {props.name}</p>
      <p>Age: {props.age}</p>
    </div>
  );
}

function App() {
  return (
    <div>
      <UserProfile name="Alice" age={25} />  
      <UserProfile name="Bob" age={30} />  
    </div>
  );
}

export default App;