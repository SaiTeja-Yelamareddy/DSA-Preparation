/*
 * Platform: CodeChef
 * Problem ID: PREACT061
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT015/problems/PREACT061
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT015
 * Status: ACCEPTED
 */

import React from "react";
import { useState, useEffect } from "react";

const useWindowWidth = (delay = 200) => {
  const [width, setWidth] = useState(window.innerWidth);

  useEffect(() => {
    let timeoutId = null;

    const handleResize = () => {
…