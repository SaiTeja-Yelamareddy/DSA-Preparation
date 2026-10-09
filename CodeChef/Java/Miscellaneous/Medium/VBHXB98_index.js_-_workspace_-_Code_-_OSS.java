/*
 * Platform: CodeChef
 * Problem ID: VBHXB98
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA99/problems/VBHXB98
 * Language: Java
 * Concept: Miscellaneous
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA99
 * Status: ACCEPTED
 */


// Serve static files (like feedback.html)



app.post('/submit-feedback-form', (req, res) => {
  console.log('Form data received:');
  console.log(req.body);
  res.send('Feedback form data received!');
});
…  console.log(`Server listening on port ${PORT}`);
});
