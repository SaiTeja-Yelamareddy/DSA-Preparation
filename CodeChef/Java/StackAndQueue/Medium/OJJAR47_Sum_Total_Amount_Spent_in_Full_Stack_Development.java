/*
 * Platform: CodeChef
 * Problem ID: OJJAR47
 * Problem: Sum Total Amount Spent in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA60/problems/OJJAR47
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA60
 * Status: ACCEPTED
 */

const words = ["apple", "banana", "cherry", "watermelon", "kiwi"];

const longestWord = words.reduce((longest, word) =>
  word.length > longest.length ? word : longest, ""
);

console.log(longestWord); 
