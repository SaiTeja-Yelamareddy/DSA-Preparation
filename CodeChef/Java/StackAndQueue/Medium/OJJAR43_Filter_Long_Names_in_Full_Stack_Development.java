/*
 * Platform: CodeChef
 * Problem ID: OJJAR43
 * Problem: Filter Long Names in Full Stack Development
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA59/problems/OJJAR43
 * Language: Java
 * Concept: StackAndQueue
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA59
 * Status: ACCEPTED
 */

let names = ["John", "Emily", "Michael", "Sara", "Chris", "Kate"];
let shortNames = names.filter((name) => {
    return name.length <= 5;
});
console.log(shortNames);
