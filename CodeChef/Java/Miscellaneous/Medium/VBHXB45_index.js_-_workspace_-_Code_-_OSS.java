/*
 * Platform: CodeChef
 * Problem ID: VBHXB45
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA95/problems/VBHXB45
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA95
 * Status: ACCEPTED
 */

const fs = require('fs');
const path = require('path');

const inputFile = path.resolve(__dirname, 'fruits.txt');
const outputFile = path.resolve(__dirname, 'filtered_fruits.txt');

console.log('Reading fruits.txt...');

// complete the code to read the inputFile
fs.readFile(inputFile, 'utf8', (err, data) =>  {
