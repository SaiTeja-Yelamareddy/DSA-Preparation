/*
 * Platform: CodeChef
 * Problem ID: FYAOAZ09
 * Problem: quote.ejs - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/IUFUSV/problems/FYAOAZ09
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: IUFUSV
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();

// Set the view engine to ejs


app.get('/', (req, res) => {
  // Array of motivational quotes
  const quotes = [
    "I am build upon the small things I do everyday and the end results are no more than a byproduct of that. -Shinsuke Kita",
