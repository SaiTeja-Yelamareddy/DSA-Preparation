/*
 * Platform: CodeChef
 * Problem ID: PREACT053
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT014/problems/PREACT053
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT014
 * Status: ACCEPTED
 */

import { useState, useEffect } from "react";
import './App.css'

function BackgroundChanger() {
  const [count, setCount] = useState(0);

  // Add useEffect here
  useEffect(() => {
    // Check if count reaches 5 or more
    if (count >= 5) {
…      <button className="btn" onClick={() => setCount(count + 1)}>Increase Count</button>
      <button className="btn reset-btn" onClick={() => setCount(0)}>Reset</button>
    </div>
  );
}

export default BackgroundChanger;