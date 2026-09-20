/*
 * Platform: CodeChef
 * Problem ID: REACTCHA03
 * Problem: CountdownTimer.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/REACTPRJ01/problems/REACTCHA03
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: REACTPRJ01
 * Status: ACCEPTED
 */

import { useState, useEffect } from 'react';
import TimerControls from './TimerControls';

function CountdownTimer() {
  const [timeLeft, setTimeLeft] = useState(10); // Start from 10 seconds
  const [isRunning, setIsRunning] = useState(false);

  // TODO: Implement useEffect for the countdown logic
  // 1. Start interval when isRunning=true
  // 2. Clear interval on unmount or when paused
