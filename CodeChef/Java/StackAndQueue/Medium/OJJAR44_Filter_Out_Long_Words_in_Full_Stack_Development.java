/*
 * Platform: CodeChef
 * Problem ID: OJJAR44
 * Problem: Filter Out Long Words in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA59/problems/OJJAR44
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA59
 * Status: ACCEPTED
 */

let words = ["apple", "banana", "pear", "kiwi", "grape", "orange"];

let shortWords = words.filter((word) => {
    return word.length <= 4; // Complete this line
});

console.log(shortWords);