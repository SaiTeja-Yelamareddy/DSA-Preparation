/*
 * Platform: CodeChef
 * Problem ID: OJJAR231
 * Problem: ThemeContext.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA91/problems/OJJAR231
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA91
 * Status: ACCEPTED
 */

import React, { createContext, useState, useContext } from "react";

const ThemeContext = createContext();

// ThemeProvider component to wrap around the app
export function ThemeProvider({ children }) {
  // TODO: Create a theme state (light/dark), default should be "light"
  const [theme, setTheme] = useState(/** TODO */);

  // TODO: Implement toggleTheme function that switches between light and dark
