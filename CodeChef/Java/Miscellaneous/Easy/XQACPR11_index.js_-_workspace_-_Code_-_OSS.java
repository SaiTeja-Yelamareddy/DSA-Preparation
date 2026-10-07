/*
 * Platform: CodeChef
 * Problem ID: XQACPR11
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/VASAVICVV/problems/XQACPR11
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: VASAVICVV
 * Status: ACCEPTED
 */

const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
  const path = parsedUrl.pathname;
  const name = parsedUrl.query.name;

  if (__________) {
    let greeting;
