/*
 * Platform: CodeChef
 * Problem ID: PREACT057
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT014/problems/PREACT057
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT014
 * Status: ACCEPTED
 */

import React, { useState, useEffect } from 'react';

function WindowTracker() {
  const [windowSize, setWindowSize] = useState({
    width: window.innerWidth,
    height: window.innerHeight
  });

  useEffect(() => {
    function handleResize() {
…
  return (
    <div>
      <button onClick={() => setShowTracker(!showTracker)}>
        Toggle Window Tracker
      </button>
      {showTracker && <WindowTracker />}
    </div>
  );
}