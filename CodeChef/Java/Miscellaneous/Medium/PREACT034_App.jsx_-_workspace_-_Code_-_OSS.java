/*
 * Platform: CodeChef
 * Problem ID: PREACT034
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT008/problems/PREACT034
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT008
 * Status: ACCEPTED
 */

import { useState } from "react";
import styles from "./App.module.css";

export function Temperature({defaultTemperature = 0}) {
  // State to store the current temperature value
  const [temperature, setTemperature] = useState(defaultTemperature);
  
  // State to track the current unit (Celsius or Fahrenheit)
  const [unit, setUnit] = useState("C");

…}

export default function App() {
  return <Temperature />;
}
