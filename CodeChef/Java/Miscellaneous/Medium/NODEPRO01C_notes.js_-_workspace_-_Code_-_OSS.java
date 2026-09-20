/*
 * Platform: CodeChef
 * Problem ID: NODEPRO01C
 * Problem: notes.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/NODEJSPRO2/problems/NODEPRO01C
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: NODEJSPRO2
 * Status: ACCEPTED
 */

const express = require('express');
const fs = require('fs');
const path = require('path');
const router = express.Router();

const notesDir = path.join(__dirname, '..', 'notes');

// View All Notes


