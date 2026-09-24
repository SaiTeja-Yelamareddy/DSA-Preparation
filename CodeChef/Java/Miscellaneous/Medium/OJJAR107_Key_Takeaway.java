/*
 * Platform: CodeChef
 * Problem ID: OJJAR107
 * Problem: Key Takeaway
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA73/problems/OJJAR107
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA73
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
