/*
 * Platform: CodeChef
 * Problem ID: PREACT031
 * Problem: Introduction to the useState Hook in React JS for Front-end development
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT008/problems/PREACT031
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT008
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
