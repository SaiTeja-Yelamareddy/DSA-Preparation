/*
 * Platform: CodeChef
 * Problem ID: NEZHKD11
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/VWHEAQ/problems/NEZHKD11
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

app.get('/', (req, res) => {
  const userAgent = req.headers['user-agent'];
  res.send(`Your User-Agent is: ${userAgent}`);
});

_____________________________
