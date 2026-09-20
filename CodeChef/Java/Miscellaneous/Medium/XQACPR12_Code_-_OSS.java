/*
 * Platform: CodeChef
 * Problem ID: XQACPR12
 * Problem: workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/MMVQCY/problems/XQACPR12
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: MMVQCY
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
…});
