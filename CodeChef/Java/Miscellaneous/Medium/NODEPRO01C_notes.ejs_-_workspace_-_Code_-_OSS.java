/*
 * Platform: CodeChef
 * Problem ID: NODEPRO01C
 * Problem: notes.ejs - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA101/problems/NODEPRO01C
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA101
 * Status: ACCEPTED
 */

const express = require('express');
const fs = require('fs');
const path = require('path');
const router = express.Router();

const notesDir = path.join(__dirname, '..', 'notes');

// View All Notes


