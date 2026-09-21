/*
 * Platform: CodeChef
 * Problem ID: PREACT023
 * Problem: Conditional Rendering in React JS for Front-end development
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT005/problems/PREACT023
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT005
 * Status: ACCEPTED
 */

function WelcomeMessage ({ isLoggedIn }){
  if (isLoggedIn) {
    return <h2>Welcome back, User! 🎉</h2>;
  } else {
    return <h2>Please log in to continue.</h2>;
  }
};

function App() {
  const userLoggedIn = false;
  
  return (
    <div>
      <WelcomeMessage isLoggedIn={userLoggedIn} />
    </div>
  );
}
export default App;