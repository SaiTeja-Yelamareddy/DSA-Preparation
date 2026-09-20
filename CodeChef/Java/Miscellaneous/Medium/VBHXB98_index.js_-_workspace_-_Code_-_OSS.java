/*
 * Platform: CodeChef
 * Problem ID: VBHXB98
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA99/problems/VBHXB98
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA99
 * Status: ACCEPTED
 */


app.post('/submit-feedback-json', (req, res) => {
  console.log('JSON data received:');
  console.log(req.body);
  res.json({ message: 'Feedback JSON data received!' });
});

const PORT = 3000;

app.listen(PORT, () => {
