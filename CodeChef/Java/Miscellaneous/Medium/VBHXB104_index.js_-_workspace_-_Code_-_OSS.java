/*
 * Platform: CodeChef
 * Problem ID: VBHXB104
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA99/problems/VBHXB104
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA99
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();

// Route 1: Welcome message at root route
app.get('/', (req, res) => {
  __________('<h1>Welcome to our store!</h1>');
});

// Route 2: Product data as JSON
app.get('/products', (___, ___) => {
