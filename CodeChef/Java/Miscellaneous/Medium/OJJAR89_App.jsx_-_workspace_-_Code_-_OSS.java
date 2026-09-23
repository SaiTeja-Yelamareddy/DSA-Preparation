/*
 * Platform: CodeChef
 * Problem ID: OJJAR89
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA69/problems/OJJAR89
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA69
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
