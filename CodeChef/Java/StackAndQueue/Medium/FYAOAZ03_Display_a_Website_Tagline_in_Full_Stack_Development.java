/*
 * Platform: CodeChef
 * Problem ID: FYAOAZ03
 * Problem: Display a Website Tagline in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA100/problems/FYAOAZ03
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA100
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();
const path = require('path');

app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

app.get('/', (req, res) => {
  res.render('index');
});

const port = 3000;
app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
