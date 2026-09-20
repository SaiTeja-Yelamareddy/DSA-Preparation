/*
 * Platform: CodeChef
 * Problem ID: VBHXB64
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA96/problems/VBHXB64
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA96
 * Status: ACCEPTED
 */


if (String(id) === '123') {
res.end('Product ID: 123, Name: Example Product, Price: $25');
} else if (String(id) === '456') {
res.end('Product ID: 456, Name: Another Product, Price: $50');
} else {
res.end('Error: Product ID is required');
}
} else {
res.writeHead(404, { 'Content-Type': 'text/plain' });
