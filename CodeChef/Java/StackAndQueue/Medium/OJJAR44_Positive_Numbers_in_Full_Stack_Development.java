/*
 * Platform: CodeChef
 * Problem ID: OJJAR44
 * Problem: Positive Numbers in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA59/problems/OJJAR44
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA59
 * Status: ACCEPTED
 */

let numbers = [10, -5, 0, 3, -2, 7, -1, 4];
let positiveNumbers = numbers.filter((number) => {
    return number >= 0;
});

console.log(positiveNumbers)