/*
 * Platform: CodeChef
 * Problem ID: VBHXB279
 * Problem: index.ts - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA132/problems/VBHXB279
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA132
 * Status: ACCEPTED
 */

import express from "express";
import type { Request, Response } from "express";

const app = express();
const port = 8080;

app.use(express.json());

// In-memory storage with type annotation
const favoriteColors: { [key: string]: string } = {};
