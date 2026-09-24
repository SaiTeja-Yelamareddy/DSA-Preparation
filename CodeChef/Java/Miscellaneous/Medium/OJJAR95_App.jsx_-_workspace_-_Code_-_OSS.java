/*
 * Platform: CodeChef
 * Problem ID: OJJAR95
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA70/problems/OJJAR95
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA70
 * Status: ACCEPTED
 */

  };

  // Function to remove a task
  function removeTask() {
    // This should remove task by index
    // Use filter() to create new array without the task
  };

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h2>📝 To-Do List</h2>
      <TaskInput addTask={addTask} />
      {/* Pass tasks and removeTask to TaskList */}
      <TaskList removeTask={removeTask} />
    </div>
  );
}

// Component for input field
function TaskInput( ) {
