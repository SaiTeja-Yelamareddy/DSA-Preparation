/*
 * Platform: CodeChef
 * Problem ID: PREACT017
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT003/problems/PREACT017
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT003
 * Status: ACCEPTED
 */

const Message = ({ children }) => {
  return <p>{children}</p>;
};

function App() {
  return (
    <div>
      <Message>Hello, this is a message!</Message>
    </div>
  );
}

export default App;
