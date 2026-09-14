/*
 * Platform: CodeChef
 * Problem ID: VBHXB21
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA93/problems/VBHXB21
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA93
 * Status: ACCEPTED
 */

// Simulated API function
async function fetchUserData() {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        const success = Math.random() > 0.5;
        if (success) {
          resolve({ id: 123, name: "John Doe" });
        } else {
          reject("Failed to fetch user data.");
        }
