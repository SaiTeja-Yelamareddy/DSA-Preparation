/*
 * Platform: CodeChef
 * Problem ID: NODEPRO01B
 * Problem: Add new notes in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA101/problems/NODEPRO01B
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA101
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
