/*
 * Platform: CodeChef
 * Problem ID: PREACT0167
 * Problem: Tabs.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT034/problems/PREACT0167
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT034
 * Status: ACCEPTED
 */

import {useState} from 'react';

function Tabs({ activeTabIndex, onPrevious, onNext, onTabClick }) {
    const totalTabs = 3;
    const isFirstTab = activeTabIndex === 0;
    const isLastTab = activeTabIndex === totalTabs - 1;

    // --- SOLUTION: Define state for phone ---
    const [fullName, setFullName] = useState('');

…        </div>
    );
}

export default Tabs;