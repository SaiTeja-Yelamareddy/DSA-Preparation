/*
 * Platform: CodeChef
 * Problem ID: FOMQGS01
 * Problem: Callbacks and Callback Patterns in Back-end development using Node JS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/IOGDTN/problems/FOMQGS01
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: IOGDTN
 * Status: ACCEPTED
 */

function greet(name) {
  console.log('Hello, ' + name + '!');
}

function delayedGreeting(name, callback) {
  setTimeout(function() {
    callback(name); // Call the callback function after the delay
  }, 2000); // Wait 2 seconds (2000 milliseconds)
}

delayedGreeting('Alice', greet);
console.log('This message appears before the greeting!');
