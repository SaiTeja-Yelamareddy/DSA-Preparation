/*
 * Platform: CodeChef
 * Problem ID: PREACT029
 * Problem: Understanding Event Handlers in React in React JS for Front-end development
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT007/problems/PREACT029
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT007
 * Status: ACCEPTED
 */

function App() {
  function addPoints(points) {
    console.log(`Added ${points} points!`);  // Corrected log message
  }

  function subtractPoints(points) {
    console.log(`Subtracted ${points} points!`); // Corrected log message
  }

  function resetScore() {
…      {/* Subtracting points */}
      <button onClick={() => subtractPoints(3)}>-3 Points</button>

      {/* Resetting Score */}
      <button onClick={resetScore}>Reset</button>
    </>
  );
}

export default App;