/*
 * Platform: CodeChef
 * Problem ID: PREACT044
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT010/problems/PREACT044
 * Language: Java
 * Concept: Miscellaneous
 * Course: React Js
 * Module: CREACT010
 * Status: ACCEPTED
 */

import { useState } from "react";

function App() {
  const [tasks, setTasks] = useState([]); // Lifted state in parent

  // Function to add a new task
  function addTask(task) {
    if (task.trim() !== "") {
      setTasks([...tasks, task]);
    }
…        </li>
      ))}
    </ul>
  );
}

export default App;
