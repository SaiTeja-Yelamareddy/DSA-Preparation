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
  const [timeLeft, setTimeLeft] = useState(10);
  const [isRunning, setIsRunning] = useState(false);

  useEffect(() => {
    let interval;
    
…          setTimeLeft(10);
        }}
      />
    </div>
  );
}

export default CountdownTimer;