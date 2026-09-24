/*
 * Platform: CodeChef
 * Problem ID: OJJAR117
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA75/problems/OJJAR117
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA75
 * Status: ACCEPTED
 */

iconst ExpensiveOperationChild = memo(function ({ data }) {
    // Heavy computation simulation
      let sum = 0;
        for (let i = 0; i < 1000000; i++) {
            sum += i;
              }

                console.log('Child rendered!'); // Now only logs once 

                  return (
