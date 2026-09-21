/*
 * Platform: CodeChef
 * Problem ID: OJJAR72
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA65/problems/OJJAR72
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA65
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