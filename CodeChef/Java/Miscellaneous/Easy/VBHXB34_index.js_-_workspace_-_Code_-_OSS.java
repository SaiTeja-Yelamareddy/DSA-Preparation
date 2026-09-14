/*
 * Platform: CodeChef
 * Problem ID: VBHXB34
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA94/problems/VBHXB34
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA94
 * Status: ACCEPTED
 */

function runImmediate() {
  setImmediate(() => {
    console.log("setImmediate executed");
  });
}

function runTimeout() {
  setTimeout(() => {
    console.log("setTimeout executed");
  }, 1000);
