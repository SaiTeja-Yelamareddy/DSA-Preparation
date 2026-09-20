/*
 * Platform: CodeChef
 * Problem ID: OJJAR232
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA91/problems/OJJAR232
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Hard
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA91
 * Status: ACCEPTED
 */

// Circle component
function Circle({ x, y, onClick }) {
  return (
    <div
      className="circle"
      data-testid="circle"
      style={{ left: ${x}%, top: ${y}% }}
      onClick={onClick}
    ></div>
  );
