/*
 * Platform: CodeChef
 * Problem ID: NODEPRO01A
 * Problem: server.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA101/problems/NODEPRO01A
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA101
 * Status: ACCEPTED
 */

const express = require('express');
const path = require('path');
const fs = require('fs');
const app = express();
const PORT = process.env.PORT || 3000;

// Middleware
app.use(express.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname, 'public')));

…if (!fs.existsSync('./notes')) fs.mkdirSync('./notes');

app.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});
