/*
 * Platform: CodeChef
 * Problem ID: FYAOAZ09
 * Problem: index.js - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/IUFUSV/problems/FYAOAZ09
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: IUFUSV
 * Status: ACCEPTED
 */

  res.render('quote', { quote: quote });
});

app.listen(3000, () => {
  console.log('Server is running on port 3000');
});
