/*
 * Platform: CodeChef
 * Problem ID: OJJAR87
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA69/problems/OJJAR87
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA69
 * Status: ACCEPTED
 */

import React, { useState } from "react";

export default function App() {
  const [fruit, setFruit] = React.useState('banana');

  return (
    <>
      <select 
        value={fruit} 
        onChange={(e) => setFruit(e.target.value)}
