/*
 * Platform: CodeChef
 * Problem ID: PREACT047
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT012/problems/PREACT047
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT012
 * Status: ACCEPTED
 */

import React from "react";

function TextInput({ id, label, type = "text" }) {
  const generatedId = React.useId(); // Hook at the top level
  const appliedId = id || generatedId;

  return (
    <div className="text-input">
      <label htmlFor={appliedId}>{label}</label>
      <input id={appliedId} type={type} className="input-field" />
    </div>
  );
}

export default function App() {
  return <TextInput id="input-id" label="Enter Text:" />;
}
