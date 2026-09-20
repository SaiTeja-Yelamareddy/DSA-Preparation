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

const http = require('http');
const url = require('url');

const products = {
'123': { name: 'Example Product', price: '$25' },
'456': { name: 'Another Product', price: '$50' }
};

const server = http.createServer((req, res) => {
const parsedUrl = url.parse(req.url, true);
