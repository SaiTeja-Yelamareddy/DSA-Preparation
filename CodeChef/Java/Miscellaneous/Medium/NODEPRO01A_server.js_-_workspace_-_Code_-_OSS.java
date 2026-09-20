/*
 * Platform: CodeChef
 * Problem ID: NODEPRO01A
 * Problem: server.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/NODEJSPRO2/problems/NODEPRO01A
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: NODEJSPRO2
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
