/*
 * Platform: CodeChef
 * Problem ID: PREACT042
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT010/problems/PREACT042
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT010
 * Status: ACCEPTED
 */

import React from 'react';
import './App.css'; 

function App() {
  // update the code 
  const [guests, setGuests] = React.useState([
    'Bruce Wayne', 'Clark Kent', 'Diana Prince'
  ]);

  return (
