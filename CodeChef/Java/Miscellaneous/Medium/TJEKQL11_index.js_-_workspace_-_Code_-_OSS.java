/*
 * Platform: CodeChef
 * Problem ID: TJEKQL11
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/LNZVHH/problems/TJEKQL11
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

const routeCounts = {};

const requestCounter = (req, res, next) => {
  const route = req.path;

  if (!routeCounts[route]) {
