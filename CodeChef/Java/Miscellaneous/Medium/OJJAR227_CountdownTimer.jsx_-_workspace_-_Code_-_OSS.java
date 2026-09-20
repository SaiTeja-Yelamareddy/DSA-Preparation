/*
 * Platform: CodeChef
 * Problem ID: OJJAR227
 * Problem: CountdownTimer.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA90/problems/OJJAR227
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA90
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
…          setIsRunning(false);
          setTimeLeft(10);
        }}
      />
    </div>
  );
}

export default CountdownTimer;