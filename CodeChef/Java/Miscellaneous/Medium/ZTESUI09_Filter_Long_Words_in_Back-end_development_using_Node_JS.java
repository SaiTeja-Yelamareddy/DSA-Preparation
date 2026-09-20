/*
 * Platform: CodeChef
 * Problem ID: ZTESUI09
 * Problem: Filter Long Words in Back-end development using Node JS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/JNKWIK/problems/ZTESUI09
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: JNKWIK
 * Status: ACCEPTED
 */

const fs = require('fs');
const path = require('path');

const inputFile = path.resolve(__dirname, 'words.txt');
const outputFile = path.resolve(__dirname, 'short_words.txt');

console.log('Reading words.txt...');

fs.readFile(inputFile, 'utf8', (err, data) => {
  if (err) {
…  });
});
