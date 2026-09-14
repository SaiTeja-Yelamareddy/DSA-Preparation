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

  console.log(`Directory "${dirName}" created successfully.`);

  fs.readdir('.', (err, files) => {
    if (err) {
      return console.error('Error reading current directory:', err);
    }

    console.log('Contents of current directory:');
    // write code to print all the files in the directory
    files.forEach(file => console.log(file));
