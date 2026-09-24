/*
 * Platform: CodeChef
 * Problem ID: PREACT056
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT014/problems/PREACT056
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT014
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
