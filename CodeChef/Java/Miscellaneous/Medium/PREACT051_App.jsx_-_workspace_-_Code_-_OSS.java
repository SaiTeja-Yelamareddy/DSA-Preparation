/*
 * Platform: CodeChef
 * Problem ID: PREACT051
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT013/problems/PREACT051
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT013
 * Status: ACCEPTED
 */

import { useState, useRef } from 'react';
import './App.css';

function FocusManager() {
  const [isFocused, setIsFocused] = useState(false);
  const inputRef = useRef(null); // Create ref

  const handleFocus = () => {
    inputRef.current.focus(); // DOM manipulation
    setIsFocused(true);
…        <button className="action-button" onClick={handleBlur}>
          Blur Input
        </button>
      </div>
    </div>
  );
}

export default FocusManager;