/*
 * Platform: CodeChef
 * Problem ID: VBHXB95
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA98/problems/VBHXB95
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA98
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

