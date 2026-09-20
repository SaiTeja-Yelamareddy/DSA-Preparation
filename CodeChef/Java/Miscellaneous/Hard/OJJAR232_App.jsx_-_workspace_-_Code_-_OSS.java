/*
 * Platform: CodeChef
 * Problem ID: OJJAR232
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA91/problems/OJJAR232
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Hard
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA91
 * Status: ACCEPTED
 */

import { useState, useEffect, useRef } from 'react';
import './App.css';

// Utility function to get random position for a circle
const getRandomPosition = () => {
  const x = Math.floor(Math.random() * 90); // % position for left
  const y = Math.floor(Math.random() * 80); // % position for top
  return { x, y };
};

