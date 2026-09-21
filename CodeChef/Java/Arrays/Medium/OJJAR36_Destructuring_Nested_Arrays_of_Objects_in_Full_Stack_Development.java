/*
 * Platform: CodeChef
 * Problem ID: OJJAR36
 * Problem: Destructuring Nested Arrays of Objects in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA57/problems/OJJAR36
 * Language: Java
 * Concept: Arrays
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA57
 * Status: ACCEPTED
 */

const products = [
  { name: 'Laptop', price: 1200 },
  { name: 'Mouse', price: 25 },
  { name: 'Keyboard', price: 75 }
];

const prices = products.map(product => product.price);

console.log(prices);