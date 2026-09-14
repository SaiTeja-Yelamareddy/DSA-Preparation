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

function coffeeShopQueue() {
  console.log("1. Customer enters the shop");

  // Schedule a task to run immediately after the current operation finishes
  process.________(() => {
    console.log("2. Barista takes the order (nextTick)");
  });

  // Schedule a microtask to run after nextTick but before timers
  Promise.________().then(() => {
