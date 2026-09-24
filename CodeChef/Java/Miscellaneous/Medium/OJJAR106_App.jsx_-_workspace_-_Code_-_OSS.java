/*
 * Platform: CodeChef
 * Problem ID: OJJAR106
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA73/problems/OJJAR106
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA73
 * Status: ACCEPTED
 */

import React, { useState, useEffect } from 'react';

function Timer() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    const timerID = setInterval(() => {
      setCount(c => c + 1);
    }, 1000);
  }, []); // No cleanup
