/*
 * Platform: CodeChef
 * Problem ID: OJJAR94
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA70/problems/OJJAR94
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA70
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
