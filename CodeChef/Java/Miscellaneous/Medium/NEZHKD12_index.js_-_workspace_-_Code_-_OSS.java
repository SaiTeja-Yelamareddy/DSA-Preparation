/*
 * Platform: CodeChef
 * Problem ID: NEZHKD12
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/VWHEAQ/problems/NEZHKD12
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: VWHEAQ
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();
const PORT = 3000;

app.get('/hello', (req, res) => {
  res.send(req.url);
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
