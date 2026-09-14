/*
 * Platform: CodeChef
 * Problem ID: VBHXB38
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA94/problems/VBHXB38
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA94
 * Status: ACCEPTED
 */

    console.log("3. Payment confirmed (Promise)");
  });

  // Schedule a task to run after microtasks but before timers
  setImmediate(() => {
    console.log("5. Notify customer (Immediate)");

    // Schedule a timer to run after 0ms
    setTimeout(() => {
      console.log("4. Coffee ready after 0ms (Timeout)");
