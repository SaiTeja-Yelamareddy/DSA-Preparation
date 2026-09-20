/*
 * Platform: CodeChef
 * Problem ID: TJEKQL17
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/LNZVHH/problems/TJEKQL17
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: LNZVHH
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();
const port = 3000;

// Route /divide that accepts numerator and denominator as query parameters
app.get('/divide', (req, res, next) => {
  try {
    const numerator = Number(req.query.numerator);
    const denominator = Number(req.query.denominator);

