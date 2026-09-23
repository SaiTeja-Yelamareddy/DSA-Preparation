/*
 * Platform: CodeChef
 * Problem ID: OJJAR83
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA68/problems/OJJAR83
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA68
 * Status: ACCEPTED
 */

import { useState } from "react";
import styles from "./App.module.css";

export function Temperature({defaultTemperature = 0}) {
  // State to store the current temperature value
  const [temperature, setTemperature] = useState(defaultTemperature);
  
  // State to track the current unit (Celsius or Fahrenheit)
  

