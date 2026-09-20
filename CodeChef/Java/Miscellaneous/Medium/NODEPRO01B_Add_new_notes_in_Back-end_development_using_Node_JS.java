/*
 * Platform: CodeChef
 * Problem ID: NODEPRO01B
 * Problem: Add new notes in Back-end development using Node JS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/NODEJSPRO2/problems/NODEPRO01B
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: NODEJSPRO2
 * Status: ACCEPTED
 */

const express = require('express');
const fs = require('fs');
const path = require('path');
const router = express.Router();

const notesDir = path.join(__dirname, '..', 'notes');

// Form Page to Add Note
router.get('/add', (req, res) => {
  res.render('add-note');
…    return res.status(200).send('Note saved'); 
  });
});

module.exports = router;
