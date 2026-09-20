/*
 * Platform: CodeChef
 * Problem ID: VBHXB101
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA99/problems/VBHXB101
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA99
 * Status: ACCEPTED
 */

  const express = require('express');
  const app = express();

  // Middleware to parse JSON request bodies


  app.post('/contact', (req, res) => {
    const { name, email, message } = req.body;

    // Check if required fields are present
