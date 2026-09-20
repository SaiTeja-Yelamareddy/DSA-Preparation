/*
 * Platform: CodeChef
 * Problem ID: NEZHKD06
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/VWHEAQ/problems/NEZHKD06
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: VWHEAQ
 * Status: ACCEPTED
 */

// Import the important liberaries and declare the variables used.


const PORT = 3000;

// Root route to serve the HTML file
app.get('/', (req, res) => {
    const filePath = path.join(__dirname, 'index.html');
    
    fs.readFile(filePath, 'utf8', (err, data) => {
