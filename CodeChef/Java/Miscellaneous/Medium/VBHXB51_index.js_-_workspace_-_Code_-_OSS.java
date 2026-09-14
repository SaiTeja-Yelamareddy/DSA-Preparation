/*
 * Platform: CodeChef
 * Problem ID: VBHXB51
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA95/problems/VBHXB51
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA95
 * Status: ACCEPTED
 */

const fs = require('fs');
const path = require('path');

const dirName = 'my_directory';

fs.mkdir(dirName, { recursive: true }, (err) => {
  if (err) {
    return console.error('Error creating directory:', err);
  }

