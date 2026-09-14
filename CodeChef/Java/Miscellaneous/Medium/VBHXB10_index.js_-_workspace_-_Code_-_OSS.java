/*
 * Platform: CodeChef
 * Problem ID: VBHXB10
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA93/problems/VBHXB10
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA93
 * Status: ACCEPTED
 */

function squareNumbersAsync(numbers, callback, finalCallback) {
  const squaredNumbers = [];
  let completedCount = 0;

  if (numbers.length === 0) {
    finalCallback(squaredNumbers);
    return;
  }

  for (let i = 0; i < numbers.length; i++) {
