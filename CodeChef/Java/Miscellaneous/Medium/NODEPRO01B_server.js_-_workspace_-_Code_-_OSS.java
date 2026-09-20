/*
 * Platform: CodeChef
 * Problem ID: NODEPRO01B
 * Problem: server.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/NODEJSPRO2/problems/NODEPRO01B
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: NODEJSPRO2
 * Status: ACCEPTED
 */

const express = require('express');
const path = require('path');
const notesRouter = require('./routes/notes');
const fs = require('fs');

const app = express();
const PORT = process.env.PORT || 3000;

// Middleware
app.use(express.urlencoded({ extended: true }));
