/*
 * Platform: CodeChef
 * Problem ID: XQACPR15
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/MMVQCY/problems/XQACPR15
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: MMVQCY
 * Status: ACCEPTED
 */

const http = require('http');
const fs = require('fs');
const path = require('path');

const server = http.createServer((req, res) => {
  if (req.url === '/') {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('Welcome to the server!');
  } else if (req.url === '/message') {
    const filePath = path.join(__dirname, 'message.txt');
…  }
});

const port = 3000;
server.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});
