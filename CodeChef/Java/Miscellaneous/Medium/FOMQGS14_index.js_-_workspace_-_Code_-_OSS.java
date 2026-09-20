/*
 * Platform: CodeChef
 * Problem ID: FOMQGS14
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/IOGDTN/problems/FOMQGS14
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: IOGDTN
 * Status: ACCEPTED
 */

// Simulated weather API function
function fetchWeather(city) {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        const success = Math.random() > 0.5;
        if (success) {
          resolve({ city, temp: "30°C", condition: "Sunny" });
        } else {
          reject(`Error: Could not fetch weather for ${city}`);
        }
…  getWeatherCallback("Bangalore");
  