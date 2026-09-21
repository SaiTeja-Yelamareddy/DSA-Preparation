/*
 * Platform: CodeChef
 * Problem ID: PREACT017
 * Problem: Children Prop in React in React JS for Front-end development
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT003/problems/PREACT017
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT003
 * Status: ACCEPTED
 */

const Message = ({ text }) => {
  return <p>{text}</p>;
};

function App() {
  return (
    <div>
      <Message text="Hello, this is a message!" />
    </div>
  );
