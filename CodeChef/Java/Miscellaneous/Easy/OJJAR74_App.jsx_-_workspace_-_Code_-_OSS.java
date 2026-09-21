/*
 * Platform: CodeChef
 * Problem ID: OJJAR74
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA65/problems/OJJAR74
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA65
 * Status: ACCEPTED
 */

// WelcomeMessage component: Displays a message based on login and premium status
export function WelcomeMessage({ isLoggedIn, isPremiumUser }) {
  return (
    <>
      {/* Application title  */}
      

      {/* Conditional rendering: Show different messages based on user status  */}
      
      
…// App component: Manages state and renders the WelcomeMessage component
export default function App() {
  const isLoggedIn = true;  // Change these values to test different scenarios
  const isPremiumUser = false; // Change these values to test different scenarios

  return (
    <WelcomeMessage isLoggedIn={isLoggedIn} isPremiumUser={isPremiumUser} />
  );
}
