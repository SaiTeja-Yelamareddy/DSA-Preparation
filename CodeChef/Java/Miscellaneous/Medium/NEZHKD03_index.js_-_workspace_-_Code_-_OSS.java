/*
 * Platform: CodeChef
 * Problem ID: NEZHKD03
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/VWHEAQ/problems/NEZHKD03
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: VWHEAQ
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();

// Use port 3000
const PORT = 3000;

// Message to be displayed on the web.
const greeting = 'Hello, there!';

// Define root route
app.get('/', (req, res) => {
  res.send(greeting);
});

// Start the server
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
