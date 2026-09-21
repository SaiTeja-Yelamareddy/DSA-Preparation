/*
 * Platform: CodeChef
 * Problem ID: OJJAR40
 * Problem: Greet Each User in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA58/problems/OJJAR40
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA58
 * Status: ACCEPTED
 */

const users = [
  { name: 'Alice', age: 25 },
  { name: 'Bob', age: 30 },
  { name: 'Charlie', age: 22 }
];

users.forEach(user => {
  console.log(`Hello, ${user.name}! You are ${user.age} years old.`);
});

