/*
 * Platform: CodeChef
 * Problem ID: NEZHKD02
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/VWHEAQ/problems/NEZHKD02
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: VWHEAQ
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();

// Use PORT to set the port number as 3000


// Simple route
app.get('/', (req, res) => {
  res.send('Hello from Express!');
});
