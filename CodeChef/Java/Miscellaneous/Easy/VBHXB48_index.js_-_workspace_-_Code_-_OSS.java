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

// 2. Resolve to absolute path
const absolutePath = path.resolve(relativePath);


// 3. Extract and print information
const baseName = path.basename(absolutePath);
const extName = path.extname(absolutePath);
const dirName = path.dirname(absolutePath);

console.log('Relative Path:', relativePath);
