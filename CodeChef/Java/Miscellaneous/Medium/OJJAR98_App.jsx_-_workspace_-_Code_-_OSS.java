/*
 * Platform: CodeChef
 * Problem ID: OJJAR98
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA71/problems/OJJAR98
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA71
 * Status: ACCEPTED
 */

import { useState, useId } from "react";
import "./App.css";

// eslint-disable-next-line react/prop-types
function SimpleForm({ name: initialName, email: initialEmail }) {
  const [name, setName] = useState();
  if (initialName != undefined){
    setName(initialName);
  }

