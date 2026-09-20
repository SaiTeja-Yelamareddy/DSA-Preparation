/*
 * Platform: CodeChef
 * Problem ID: VBHXB84
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA98/problems/VBHXB84
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA98
 * Status: ACCEPTED
 */

  res.send('Welcome to the Bookstore API!');
});

// Mount routers
app.use('/books', booksRouter);
app.use('/authors', authorsRouter);

// Start the server
______________________
  console.log(`Server listening on port ${port}`);
