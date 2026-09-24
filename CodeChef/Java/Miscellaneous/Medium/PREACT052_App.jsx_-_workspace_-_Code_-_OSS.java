/*
 * Platform: CodeChef
 * Problem ID: PREACT052
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT014/problems/PREACT052
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT014
 * Status: ACCEPTED
 */

import { useState, useEffect } from "react";

function Example() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    document.title = `Clicked ${count} times`;
  });

  return (
