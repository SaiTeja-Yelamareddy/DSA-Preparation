/*
 * Platform: CodeChef
 * Problem ID: REACTCHA05
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/REACTPRJ02/problems/REACTCHA05
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: REACTPRJ02
 * Status: ACCEPTED
 */

import { useState, useEffect } from 'react'
import { fetchCryptoPrices } from './data'

function App() {
  const [prices, setPrices] = useState([])

  useEffect(() => {
    // TODO 1: Create a polling function that calls fetchCryptoPrices every 5 seconds
    // TODO 2: On each poll, update state with new prices
    // TODO 3: Don't forget to clean up interval when component unmounts
