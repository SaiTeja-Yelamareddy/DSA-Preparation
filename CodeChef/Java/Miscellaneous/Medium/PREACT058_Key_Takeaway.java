/*
 * Platform: CodeChef
 * Problem ID: PREACT058
 * Problem: Key Takeaway
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT014/problems/PREACT058
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT014
 * Status: ACCEPTED
 */

import React, {useState, useEffect} from "react";

function LightSwitch() {
  const [isOn, setIsOn] = useState(false);

  useEffect(() => {
    const handleKeyPress = (e) => {
      if (e.code === 'KeyL') {
        // 🚨 Problem: Uses STALE isOn value!
        setIsOn(!isOn);
