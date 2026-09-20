/*
 * Platform: CodeChef
 * Problem ID: VBHXB82
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA98/problems/VBHXB82
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA98
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();
const port = 3000;

app.get('/books/:bookId', (req, res) => {
  const bookId = req.params.bookId;
  const chapter = req.query.chapter;

  let responseText = `Book ID: ${________}`;
  if (chapter) {
