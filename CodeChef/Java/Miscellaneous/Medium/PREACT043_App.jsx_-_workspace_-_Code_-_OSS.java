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

import React, { useState } from 'react';

// Child Component: Now "controlled" by the parent
// It receives the value and the function to call when it changes.
function TextInput({ value, onChange }) {
  return <input value={value} onChange={onChange} />;
}

// Parent Component: Now holds the state and the logic to update it
function App() {
…export default App;