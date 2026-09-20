/*
 * Platform: CodeChef
 * Problem ID: TJEKQL09
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/LNZVHH/problems/TJEKQL09
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: LNZVHH
 * Status: ACCEPTED
 */

const express = require('express');
const path = require('path');
const app = express();
const port = 3000;

// Serve static files (including JSON) from the 'public' directory
app.use(express.static(path.join(__dirname, 'public')));

app.listen(port, () => {
    console.log(`Server is running at http://localhost:${port}`);
});
