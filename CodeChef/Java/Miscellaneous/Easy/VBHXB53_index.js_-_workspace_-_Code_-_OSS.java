/*
 * Platform: CodeChef
 * Problem ID: VBHXB53
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA95/problems/VBHXB53
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA95
 * Status: ACCEPTED
 */

// import the fs module


fs.readFile('my_missing_file.txt', 'utf8', (err, data) => {
  if (err) {
    console.error('Error: File not found!');
    console.error(err.message); 
  } else {
    console.log('File read successfully:');
    console.log(data);
