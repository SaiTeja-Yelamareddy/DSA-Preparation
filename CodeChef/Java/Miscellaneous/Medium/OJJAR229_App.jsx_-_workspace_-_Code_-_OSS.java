/*
 * Platform: CodeChef
 * Problem ID: OJJAR229
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA91/problems/OJJAR229
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA91
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
