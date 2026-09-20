/*
 * Platform: CodeChef
 * Problem ID: NEZHKD08
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/VWHEAQ/problems/NEZHKD08
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: VWHEAQ
 * Status: ACCEPTED
 */


// Define a route for GET requests to the path "/products" that responds with "Our products are coming soon!"
app.get('/products', (req, res) => {
  res.send('Our products are coming soon!');
});

app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});
