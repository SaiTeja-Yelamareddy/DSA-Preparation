/*
 * Platform: CodeChef
 * Problem ID: PREACT070
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT009/problems/PREACT070
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT009
 * Status: ACCEPTED
 */

import React, { useState } from "react"; 
import "./App.css";

// Functional component to update a user's profile information
function ProfileUpdater() {
  // User state holding name, age, and address properties
  const [user, setUser] = useState({ 
    name: "Alice", 
    age: 25, 
    address: { city: "Delhi", country: "India" } 
