/*
 * Platform: CodeChef
 * Problem ID: OJJAR39
 * Problem: Calculate the Total Score in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA58/problems/OJJAR39
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA58
 * Status: ACCEPTED
 */

let scores = [10, 45, 23, 8];
let totalScore = 0; // Start with a total of 0

// Use forEach to go through each score
scores.forEach((score) => {
  // Add the current score to the totalScore
  totalScore = totalScore + score;
});

console.log("Total Score:", totalScore); 