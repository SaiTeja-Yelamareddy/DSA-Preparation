/*
 * Platform: CodeChef
 * Problem ID: PREACT0161
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT034/problems/PREACT0161
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT034
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
