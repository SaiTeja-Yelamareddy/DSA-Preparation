/*
 * Platform: CodeChef
 * Problem ID: VBHXB46
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA95/problems/VBHXB46
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA95
 * Status: ACCEPTED
 */


fs.writeFile(outputFile, result, 'utf8', (err) => {
if (err) {
return console.error('Error writing file:', err);
}

console.log('Short words written successfully!');
});
});