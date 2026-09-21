/*
 * Platform: CodeChef
 * Problem ID: PREACT007
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT002/problems/PREACT007
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT002
 * Status: ACCEPTED
 */

export function App() { 
    const username = "Alex";  
    const currentYear = new Date().getFullYear();  

    return ( 
      <div> 
        Welcome, {username}! Happy {currentYear}!
      </div> 
    ); 
}
export default App;
