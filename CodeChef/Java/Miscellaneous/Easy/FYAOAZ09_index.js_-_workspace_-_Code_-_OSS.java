/*
 * Platform: CodeChef
 * Problem ID: FYAOAZ09
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA100/problems/FYAOAZ09
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA100
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();

// Set the view engine to ejs


app.get('/', (req, res) => {
  // Array of motivational quotes
  const quotes = [
    "I am build upon the small things I do everyday and the end results are no more than a byproduct of that. -Shinsuke Kita",
…
  
});

app.listen(3000, () => {
  console.log('Server is running on port 3000');
});
