/*
 * Platform: CodeChef
 * Problem ID: NODEPRO01A
 * Problem: Setting up frontend and server in Back-end development using Node JS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/NODEJSPRO2/problems/NODEPRO01A
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: NODEJSPRO2
 * Status: ACCEPTED
 */

const express = require('express');
const path = require('path');
const fs = require('fs');
const app = express();
const PORT = process.env.PORT || 3000;

app.use(express.urlencoded({ extended: true }));
// Middleware to handle the public folder to serve css in static format


