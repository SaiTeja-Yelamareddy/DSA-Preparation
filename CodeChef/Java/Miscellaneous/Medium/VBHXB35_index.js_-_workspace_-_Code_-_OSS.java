/*
 * Platform: CodeChef
 * Problem ID: VBHXB35
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA94/problems/VBHXB35
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA94
 * Status: ACCEPTED
 */

      if (seconds === 0) {
        clearInterval(intervalId); // TODO: stop the repeated timer

        // After last countdown, wait 1 second then print final message
        setTimeout(() => { // TODO: run once after delay
          console.log("Countdown complete!");
        }, 1000);
      }
    }, 1000);
  });
