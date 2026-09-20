/*
 * Platform: CodeChef
 * Problem ID: VBHXB22
 * Problem: Simulate File Processing with Error Handling in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA93/problems/VBHXB22
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA93
 * Status: ACCEPTED
 */

function fetchWeather(city) {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        const success = Math.random() > 0.5;
        if (success) {
          resolve({ city, temp: "30°C", condition: "Sunny" });
        } else {
          reject(`Error: Could not fetch weather for ${city}`);
        }
      }, 50);
