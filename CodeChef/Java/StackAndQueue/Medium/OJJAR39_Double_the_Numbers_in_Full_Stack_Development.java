/*
 * Platform: CodeChef
 * Problem ID: OJJAR39
 * Problem: Double the Numbers in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA58/problems/OJJAR39
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA58
 * Status: ACCEPTED
 */

let originalNumbers = [1, 5, 10];
let doubledNumbers = []; // Create an empty array to store the results

// Iterate over the original numbers
originalNumbers.forEach((number) => {
  // Calculate the doubled value
  let doubledValue = number * 2;
  // Add the doubled value to our new array
  doubledNumbers.push(doubledValue);
});

console.log("Doubled:", doubledNumbers);