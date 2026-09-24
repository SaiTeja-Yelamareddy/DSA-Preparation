/*
 * Platform: CodeChef
 * Problem ID: PREACT063
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT015/problems/PREACT063
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT015
 * Status: ACCEPTED
 */

import React from 'react';
import './App.css';

const ENDPOINT = 'https://jsonplaceholder.typicode.com/posts';

function NewsletterForm() {
  const [name, setName] = React.useState('');
  const [email, setEmail] = React.useState('');
  const [status, setStatus] = React.useState('idle');
  const [error, setError] = React.useState(null);
…export default NewsletterForm;