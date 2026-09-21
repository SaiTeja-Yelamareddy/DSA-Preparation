/*
 * Platform: CodeChef
 * Problem ID: PREACT0129
 * Problem: Positive Numbers in React JS for Front-end development
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT028/problems/PREACT0129
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT028
 * Status: ACCEPTED
 */

let numbers = [10, -5, 0, 3, -2, 7, -1, 4];
let positiveNumbers = numbers.filter((number) => {
    return number >= 0;
});

console.log(positiveNumbers)