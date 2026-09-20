/*
 * Platform: CodeChef
 * Problem ID: OJJAR226
 * Problem: FilterableList.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA90/problems/OJJAR226
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA90
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
