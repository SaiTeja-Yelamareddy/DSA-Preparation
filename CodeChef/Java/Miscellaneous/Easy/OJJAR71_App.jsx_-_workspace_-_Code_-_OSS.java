/*
 * Platform: CodeChef
 * Problem ID: OJJAR71
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA64/problems/OJJAR71
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA64
 * Status: ACCEPTED
 */

  return (
    <div>
      {students.map((student) => (
        <div className="student-card">
          <h3>{student.name}</h3>
          <p>Age: {student.age}</p>
        </div>
      ))}
    </div>
  );
