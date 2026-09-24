/*
 * Platform: CodeChef
 * Problem ID: PREACT055
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT014/problems/PREACT055
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT014
 * Status: ACCEPTED
 */

import { useState, useEffect } from 'react';
import './App.css';

function MovieSearch() {
  const [searchQuery, setSearchQuery] = useState('');
  const [filteredMovies, setFilteredMovies] = useState([]);

  const movies = [
    'Inception',
    'The Dark Knight',
