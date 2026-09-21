/*
 * Platform: CodeChef
 * Problem ID: PREACT026
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT006/problems/PREACT026
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT006
 * Status: ACCEPTED
 */

const range = (start, end, step = 1) => {
  let result = [];

  if (typeof end === 'undefined') {
    end = start;
    start = 0;
  }

  for (let i = start; i < end; i += step) {
    result.push(i);
