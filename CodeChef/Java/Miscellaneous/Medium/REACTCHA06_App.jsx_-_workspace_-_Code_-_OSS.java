/*
 * Platform: CodeChef
 * Problem ID: REACTCHA06
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/REACTPRJ02/problems/REACTCHA06
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: REACTPRJ02
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

