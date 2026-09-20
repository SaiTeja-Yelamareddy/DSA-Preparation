/*
 * Platform: CodeChef
 * Problem ID: FYAOAZ08
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA100/problems/FYAOAZ08
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA100
 * Status: ACCEPTED
 */

const express = require('express');
const app = express();

// Set the view engine to ejs
app.set('view engine', 'ejs');

// Route to display personalized greeting
app.get('/', (req, res) => {
  // Prepare the data to be passed to the view
  const name = 'Abhay'; // You can replace with req.query.name to make it dynamic
