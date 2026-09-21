/*
 * Platform: CodeChef
 * Problem ID: YIQUZN03
 * Problem: Filter Long Names in React JS for Front-end development
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT028/problems/YIQUZN03
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT028
 * Status: ACCEPTED
 */

let names = ["John", "Emily", "Michael", "Sara", "Chris", "Kate"];
let shortNames = names.filter((name) => {
    return name.length <= 5;
});
console.log(shortNames);
