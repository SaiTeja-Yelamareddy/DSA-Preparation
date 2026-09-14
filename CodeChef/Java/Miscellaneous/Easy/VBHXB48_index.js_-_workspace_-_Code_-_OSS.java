/*
 * Platform: CodeChef
 * Problem ID: VBHXB48
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA95/problems/VBHXB48
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA95
 * Status: ACCEPTED
 */

const path = require('path');

// 1. Construct the file path
const reportsDir = 'reports';
const yearDir = '2024';
const fileName = 'sales.txt';

// Use path.join() to create the full file path
const relativePath = path.join(reportsDir, yearDir, fileName);

