/*
 * Platform: CodeChef
 * Problem ID: OJJAR47
 * Problem: Total Price Calculation in undefined
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA60/problems/OJJAR47
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA60
 * Status: ACCEPTED
 */

const cartPrices = [29.99, 9.99, 4.99, 14.99, 25.00];

// Using reduce to calculate the total price
const totalPrice = cartPrices.reduce((accumulator, currentValue) => accumulator + currentValue, 0);

console.log(totalPrice); // Output: 84.96