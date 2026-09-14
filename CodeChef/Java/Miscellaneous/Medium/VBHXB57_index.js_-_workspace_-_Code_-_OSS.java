/*
 * Platform: CodeChef
 * Problem ID: VBHXB57
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA96/problems/VBHXB57
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA96
 * Status: ACCEPTED
 */

const http = require('http');

// Function to get the appropriate greeting based on current hour
function getGreeting() {
    const now = new Date();
    const hour = now.getHours() +5;
    
    if (hour < 12) {
        return "Good morning!";
    } else if (hour >= 12 && hour < 18) {
