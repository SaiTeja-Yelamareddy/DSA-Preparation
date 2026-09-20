/*
 * Platform: CodeChef
 * Problem ID: TICTACTOE02
 * Problem: Square.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/REACTPRJ01/problems/TICTACTOE02
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: REACTPRJ01
 * Status: ACCEPTED
 */

function Square({ value, onClick }) {
  return (
    <button
      className="square"
      onClick={onClick}
    >
      {value}
    </button>
  );
}

export default Square;
