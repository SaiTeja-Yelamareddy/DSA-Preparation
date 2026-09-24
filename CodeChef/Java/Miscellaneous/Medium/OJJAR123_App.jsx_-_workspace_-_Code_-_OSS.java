/*
 * Platform: CodeChef
 * Problem ID: OJJAR123
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA75/problems/OJJAR123
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA75
 * Status: ACCEPTED
 */

import Tabs from './Tabs';
import './App.css';

function App() {
  // Start adding useState and handler functions here
  return (
    <div className="App">
      <h1>Job Application Form</h1>
      {/* Modify this line to pass new props */}
      <Tabs activeTabIndex={0} />
