/*
 * Platform: CodeChef
 * Problem ID: OJJAR97
 * Problem: React Hooks in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA71/problems/OJJAR97
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA71
 * Status: ACCEPTED
 */

import React from "react";

function TextInput({ id, label, type = "text" }) {
  let appliedId;
  
  if (!id) {
    appliedId = React.useId(); // ❌ Hook inside condition (incorrect usage)
  } else {
    appliedId = id;
  }
