/*
 * Platform: CodeChef
 * Problem ID: TJEKQL14
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/LNZVHH/problems/TJEKQL14
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

// Middleware 1: Logs the request path
const logPathMiddleware = (req, res, next) => {
  console.log(`Requested Path: ${req.path}`);
  next();
};

