/*
 * Platform: CodeChef
 * Problem ID: FYAOAZ14
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/IUFUSV/problems/FYAOAZ14
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: IUFUSV
 * Status: ACCEPTED
 */

const express = require('express');
const path = require('path');

const app = express();

// Middleware to parse form data
app.use(express.urlencoded({ extended: false }));

// Set EJS as the view engine
app.set('view engine', 'ejs');
