/*
 * Platform: CodeChef
 * Problem ID: VBHXB19
 * Problem: Recipe Preparation in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA93/problems/VBHXB19
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA93
 * Status: ACCEPTED
 */

function prepareBread() {
  return new Promise(resolve => {
    setTimeout(() => {
      resolve("Bread prepared!");
    }, 1000); // Simulate preparing bread for 1 second
  });
}

function addFilling() {
  return new Promise(resolve => {
