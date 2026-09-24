/*
 * Platform: CodeChef
 * Problem ID: OJJAR90
 * Problem: Create Simple Todo List in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA69/problems/OJJAR90
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA69
 * Status: ACCEPTED
 */

import { useState } from 'react';
import './App.css';

// Main component of the application
function App() {
  // State to keep track of the list of todos
  const [todos, setTodos] = useState([]);

  // State to manage the input for adding new todos
  const [newTodo, setNewTodo] = useState('');
