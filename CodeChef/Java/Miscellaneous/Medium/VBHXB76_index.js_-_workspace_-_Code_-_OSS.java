/*
 * Platform: CodeChef
 * Problem ID: VBHXB76
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA97/problems/VBHXB76
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA97
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
