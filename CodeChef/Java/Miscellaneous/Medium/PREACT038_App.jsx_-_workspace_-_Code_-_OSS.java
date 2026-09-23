/*
 * Platform: CodeChef
 * Problem ID: PREACT038
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT009/problems/PREACT038
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT009
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
