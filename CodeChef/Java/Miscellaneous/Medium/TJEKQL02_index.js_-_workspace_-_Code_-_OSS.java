/*
 * Platform: CodeChef
 * Problem ID: TJEKQL02
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/LNZVHH/problems/TJEKQL02
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: LNZVHH
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
