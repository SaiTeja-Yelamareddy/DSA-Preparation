/*
 * Platform: CodeChef
 * Problem ID: VBHXB71
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA97/problems/VBHXB71
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA97
 * Status: ACCEPTED
 */

// Import the important liberaries and declare the variables used.


const PORT = 3000;

// Root route to serve the HTML file
app.get('/', (req, res) => {
    const filePath = path.join(__dirname, 'index.html');
    
    fs.readFile(filePath, 'utf8', (err, data) => {
