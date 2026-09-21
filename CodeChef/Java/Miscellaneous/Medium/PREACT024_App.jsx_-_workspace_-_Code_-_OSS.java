/*
 * Platform: CodeChef
 * Problem ID: PREACT024
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT005/problems/PREACT024
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT005
 * Status: ACCEPTED
 */

export function WelcomeMessage({ isLoggedIn, isPremiumUser }) {
  return (
    <>
      <h1>My React App</h1>
      {isLoggedIn && isPremiumUser ? (
        <p>Welcome to Premium Content! 🎉</p>
      ) : (
        <p>Please log in and upgrade to premium...</p>
      )}
    </>
…}
