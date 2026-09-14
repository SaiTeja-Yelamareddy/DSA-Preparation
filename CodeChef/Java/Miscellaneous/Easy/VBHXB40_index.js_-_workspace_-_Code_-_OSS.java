/*
 * Platform: CodeChef
 * Problem ID: VBHXB40
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA95/problems/VBHXB40
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA95
 * Status: ACCEPTED
 */

const path = require('path');
const os = require('os');

const filePath = '/users/john/documents/report.txt';

//
const fileName = path.basename(filePath);
const platform = os.platform();

console.log('Extracted filename:', fileName);
