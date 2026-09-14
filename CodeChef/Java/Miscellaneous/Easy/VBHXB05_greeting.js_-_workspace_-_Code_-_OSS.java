/*
 * Platform: CodeChef
 * Problem ID: VBHXB05
 * Problem: greeting.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA92/problems/VBHXB05
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA92
 * Status: ACCEPTED
 */

const options = { timeZone: 'Asia/Kolkata', hour: 'numeric', hour12: false };
const currentHour = new Intl.DateTimeFormat('en-US', options).format(new Date());

let greeting;

if (currentHour < 12) {
    greeting = "Good Morning!";
}
// complete your code from here

