/*
 * Platform: CodeChef
 * Problem ID: VBHXB37
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA94/problems/VBHXB37
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA94
 * Status: ACCEPTED
 */

function runOrderExample() {
  console.log("Start");

  process.nextTick(() => {
    console.log("Next Tick");
  });

  Promise.resolve().then(() => {
    console.log("Promise");
  });
