/*
 * Platform: CodeChef
 * Problem ID: ZWDLEP11
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/UQMFVA/problems/ZWDLEP11
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: UQMFVA
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
