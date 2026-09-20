/*
 * Platform: CodeChef
 * Problem ID: VBHXB85
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA98/problems/VBHXB85
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA98
 * Status: ACCEPTED
 */

const express = require('express');
const http = require('http');
const productsRouter = require('./products');
const categoriesRouter = require('./categories');

const app = express();

app.use('/products', productsRouter);
app.use('/categories', categoriesRouter);

