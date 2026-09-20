/*
 * Platform: CodeChef
 * Problem ID: REACTCHA02
 * Problem: FilterableList.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/REACTPRJ01/problems/REACTCHA02
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: REACTPRJ01
 * Status: ACCEPTED
 */

import { useState } from 'react';
import ListItem from './ListItem';

// TODO: Implement filtering logic
// Requirements:
// 1. Should filter items based on search input
// 2. Should be case-insensitive
// 3. Should show all items when search is empty
function FilterableList({ items }) {
  const [searchTerm, setSearchTerm] = useState('');
