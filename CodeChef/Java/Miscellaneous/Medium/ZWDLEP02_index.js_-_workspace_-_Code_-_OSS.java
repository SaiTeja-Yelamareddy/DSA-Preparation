/*
 * Platform: CodeChef
 * Problem ID: ZWDLEP02
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/UQMFVA/problems/ZWDLEP02
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: UQMFVA
 * Status: ACCEPTED
 */

const express = require('express');
const path = require('path');

const app = express();

// Middleware to parse URL-encoded form data
app.use(express.urlencoded({ extended: false }));

// Middleware to parse JSON data
app.use(express.json());
…  console.log(`Server listening on port ${PORT}`);
});
