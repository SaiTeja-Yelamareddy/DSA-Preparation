/*
 * Platform: CodeChef
 * Problem ID: TJEKQL15
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/LNZVHH/problems/TJEKQL15
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: LNZVHH
 * Status: ACCEPTED
 */

// app.js
const express = require('express');
const app = express();
const port = 3000;

// Middleware 1: Sets the response message
const messageMiddleware = (req, res, next) => {
  res.locals.message = 'hello world';
  next();
};
…});
