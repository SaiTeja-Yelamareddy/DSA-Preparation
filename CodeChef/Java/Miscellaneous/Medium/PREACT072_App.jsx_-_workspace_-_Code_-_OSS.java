/*
 * Platform: CodeChef
 * Problem ID: PREACT072
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT016/problems/PREACT072
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT016
 * Status: ACCEPTED
 */

import { useState } from 'react';
import './App.css';

// Child Component (Unoptimized)
function ExpensiveOperationChild({ data }) {
  // Heavy computation simulation
  let sum = 0;
  for (let i = 0; i < 1000000; i++) {
    sum += i;
  }
