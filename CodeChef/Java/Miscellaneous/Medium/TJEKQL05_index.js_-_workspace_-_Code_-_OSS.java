/*
 * Platform: CodeChef
 * Problem ID: TJEKQL05
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/VASAVICVV/problems/TJEKQL05
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: VASAVICVV
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();
const port = 3000;

// Import routers
const booksRouter = require('./books');
const authorsRouter = require('./authors');

// Root route
app.get('/', (req, res) => {
