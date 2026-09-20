/*
 * Platform: CodeChef
 * Problem ID: OJJAR228
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA91/problems/OJJAR228
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA91
 * Status: ACCEPTED
 */

// Find the bug in the below code
import React, { useState, useEffect } from "react";

function App() {
  const [score, setScore] = useState(0);

  useEffect(() => {
    setScore(score + 1);
  });

