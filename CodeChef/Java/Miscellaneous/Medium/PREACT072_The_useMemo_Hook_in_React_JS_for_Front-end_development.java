/*
 * Platform: CodeChef
 * Problem ID: PREACT072
 * Problem: The useMemo Hook in React JS for Front-end development
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT016/problems/PREACT072
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT016
 * Status: ACCEPTED
 */

import { useState, memo } from 'react';
import './App.css';

// Optimized Child Component
const ExpensiveOperationChild = memo(function ({ data }) {
  // Heavy computation simulation
  let sum = 0;
  for (let i = 0; i < 1000000; i++) {
    sum += i;
  }
…        Click to Increment: {count}
      </button>
      <ExpensiveOperationChild data="hello" />
    </div>
  );
}

export default ParentComponent;