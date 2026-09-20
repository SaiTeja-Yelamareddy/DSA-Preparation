/*
 * Platform: CodeChef
 * Problem ID: REACTCHA07
 * Problem: ThemeContext.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/REACTPRJ02/problems/REACTCHA07
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: REACTPRJ02
 * Status: ACCEPTED
 */

import React, { createContext, useState, useContext } from "react";

const ThemeContext = createContext();

// ThemeProvider component to wrap around the app
export function ThemeProvider({ children }) {
  // TODO: Create a theme state (light/dark), default should be "light"
  const [theme, setTheme] = useState(/** TODO */);

  // TODO: Implement toggleTheme function that switches between light and dark
