/*
 * Platform: CodeChef
 * Problem ID: PREACT043
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT010/problems/PREACT043
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT010
 * Status: ACCEPTED
 */

import { useState } from 'react';

// Problematic Approach - State is NOT lifted
function TextInput() {
  const [text, setText] = useState(''); // Each box has its own 'text' state
  return <input value={text} onChange={(e) => setText(e.target.value)} />;
}

function App() {
  return (
