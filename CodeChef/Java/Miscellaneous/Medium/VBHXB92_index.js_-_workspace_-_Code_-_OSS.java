/*
 * Platform: CodeChef
 * Problem ID: VBHXB92
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA98/problems/VBHXB92
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

// Middleware 1: Logs the request path
const logPathMiddleware = (req, res, next) => {
  console.log(`Requested Path: ${req.path}`);
  next();
};

