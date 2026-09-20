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
    // Function to fetch and update prices
    const updatePrices = async () => {
      const data = await fetchCryptoPrices()
…          ))}
        </tbody>
      </table>
    </div>
  )
}

export default App
