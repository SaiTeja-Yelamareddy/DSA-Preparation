/*
 * Platform: CodeChef
 * Problem ID: OJJAR80
 * Problem: Understanding State and Re-Renders in React in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA68/problems/OJJAR80
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA68
 * Status: ACCEPTED
 */

function App() {
  let count = 0 ;
  return (
    <>
      <p>You clicked {count} times</p>
      <button onClick={() => count++}>
        Click me
      </button>
    </>
  );
