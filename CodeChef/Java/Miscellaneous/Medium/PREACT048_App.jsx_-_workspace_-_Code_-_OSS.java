/*
 * Platform: CodeChef
 * Problem ID: PREACT048
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT012/problems/PREACT048
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT012
 * Status: ACCEPTED
 */

import { useState, useId } from "react";
import "./App.css";

// eslint-disable-next-line react/prop-types
function SimpleForm({ name: initialName = "", email: initialEmail = "" }) {
  const [name, setName] = useState(initialName);
  const [email, setEmail] = useState(initialEmail);

  const uniqueId = useId(); // Corrected: useId() does not take arguments

…}

function App() {
  return <SimpleForm name="Codechef" email="codechef@gmail.com" />;
}

export default App;
