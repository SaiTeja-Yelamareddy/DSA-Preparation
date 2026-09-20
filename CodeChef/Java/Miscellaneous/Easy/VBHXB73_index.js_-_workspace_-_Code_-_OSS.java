/*
 * Platform: CodeChef
 * Problem ID: VBHXB73
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA97/problems/VBHXB73
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Easy
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA97
 * Status: ACCEPTED
 */


// Define a route for GET requests to the path "/products" that responds with "Our products are coming soon!"
app.get('/products', (req, res) => {
  res.send('Our products are coming soon!');
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT
