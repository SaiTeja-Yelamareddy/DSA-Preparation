/*
 * Platform: CodeChef
 * Problem ID: NEZHKD09
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/VWHEAQ/problems/NEZHKD09
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: VWHEAQ
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();

const PORT = 3000;

app.get('/', (req, res) => {
  res.send('Welcome to our services page!');
});

app.get('/web', (req, res) => {
…