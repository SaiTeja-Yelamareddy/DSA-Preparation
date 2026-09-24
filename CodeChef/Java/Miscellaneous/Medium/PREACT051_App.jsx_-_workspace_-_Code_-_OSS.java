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

import { useState } from 'react';
import './App.css';

function FocusManager() {
  const [isFocused, setIsFocused] = useState(false);

  // ❌ Missing useRef implementation
  const handleFocus = () => {
    // TODO: Focus input using ref
    setIsFocused(true);
