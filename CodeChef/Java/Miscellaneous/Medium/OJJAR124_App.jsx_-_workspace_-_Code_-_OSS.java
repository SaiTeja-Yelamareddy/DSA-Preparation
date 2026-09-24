/*
 * Platform: CodeChef
 * Problem ID: OJJAR124
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA75/problems/OJJAR124
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA75
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
