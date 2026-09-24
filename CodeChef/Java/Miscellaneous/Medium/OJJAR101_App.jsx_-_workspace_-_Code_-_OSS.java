/*
 * Platform: CodeChef
 * Problem ID: OJJAR101
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA72/problems/OJJAR101
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA72
 * Status: ACCEPTED
 */

import { useState } from 'react';
import './App.css';

function FocusManager() {
  const [isFocused, setIsFocused] = useState(false);

  // ❌ Missing useRef implementation
  const handleFocus = () => {
    // TODO: Focus input using ref
    setIsFocused(true);
