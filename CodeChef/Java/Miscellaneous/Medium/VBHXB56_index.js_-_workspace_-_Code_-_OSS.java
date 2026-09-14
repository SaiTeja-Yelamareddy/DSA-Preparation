/*
 * Platform: CodeChef
 * Problem ID: VBHXB56
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA96/problems/VBHXB56
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA96
 * Status: ACCEPTED
 */

const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res) => {
  // complete the code to read the file
 fs.readFile('my-file.txt', 'utf8', (err, data) => {
    if (err) {
      res.writeHead(500, { 'Content-Type': 'text/plain' });
      res.end('Error reading file!');
      return;
