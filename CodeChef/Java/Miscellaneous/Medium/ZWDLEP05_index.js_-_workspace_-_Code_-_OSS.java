/*
 * Platform: CodeChef
 * Problem ID: ZWDLEP05
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/UQMFVA/problems/ZWDLEP05
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: UQMFVA
 * Status: ACCEPTED
 */

  const express = require('express');
  const app = express();

  // Middleware to parse JSON request bodies


  app.post('/contact', (req, res) => {
    const { name, email, message } = req.body;

    // Check if required fields are present
