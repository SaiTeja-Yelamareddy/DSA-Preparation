/*
 * Platform: CodeChef
 * Problem ID: PREACT0165
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT034/problems/PREACT0165
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT034
 * Status: ACCEPTED
 */

import { useState } from 'react'; // 1. Import useState
import Tabs from './Tabs';
import './App.css';

function App() {
  // 1. Manage state for the active tab index
  const [activeTabIndex, setActiveTabIndex] = useState(0);
  const totalTabs = 3; // Define total number of tabs (useful for logic)

  // 2. Create navigation handler functions
