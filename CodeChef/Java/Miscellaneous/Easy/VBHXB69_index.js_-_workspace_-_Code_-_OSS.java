/*
 * Platform: CodeChef
 * Problem ID: VBHXB69
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA97/problems/VBHXB69
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA97
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();

// Use PORT to set the port number as 3000


// Simple route
app.get('/', (req, res) => {
  res.send('Hello from Express!');
});
