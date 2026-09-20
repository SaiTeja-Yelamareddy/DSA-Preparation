/*
 * Platform: CodeChef
 * Problem ID: VBHXB70
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA97/problems/VBHXB70
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA97
 * Status: ACCEPTED
 */

// Define root route
app.get('/', (req, res) => {
  res.send(greeting);
  });

  // Start the server
  app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
    });
    