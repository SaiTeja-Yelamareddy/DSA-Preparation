/*
 * Platform: CodeChef
 * Problem ID: PREACT036
 * Problem: App.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT009/problems/PREACT036
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT009
 * Status: ACCEPTED
 */

import { useState } from "react";
import "./App.css";

export default function UseStateForm() {
  const [value, setValue] = useState("");

  const generateRandomString = () => {
    const randomStr = Math.random().toString(36).substring(2, 8);
    setValue(randomStr);
  };
…      />
      <div className="output-box">
        <p>Live Display: {value}</p>
      </div>
      <button onClick={generateRandomString} className="btn">Generate Random String</button>
    </div>
  );
}
