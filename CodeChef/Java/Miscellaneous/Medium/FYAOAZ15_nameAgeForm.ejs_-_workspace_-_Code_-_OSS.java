/*
 * Platform: CodeChef
 * Problem ID: FYAOAZ15
 * Problem: nameAgeForm.ejs - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/nodejs/IUFUSV/problems/FYAOAZ15
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Nodejs
 * Module: IUFUSV
 * Status: ACCEPTED
 */

<!DOCTYPE html>
<html>
<head>
    <title>Name and Age Form</title>
</head>
<body>
    <h1>Please enter your name and age:</h1>
    <form action="/submit-name-age" method="POST">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name"><br><br>
