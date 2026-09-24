/*
 * Platform: CodeChef
 * Problem ID: PREACT0166
 * Problem: Tabs.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT034/problems/PREACT0166
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT034
 * Status: ACCEPTED
 */

function Tabs({ activeTabIndex, onPrevious, onNext, onTabClick}) {
  const totalTabs = 3;
  const isFirstTab = activeTabIndex === 0;
  const isLastTab = activeTabIndex === totalTabs - 1;

  return (
    <div className="tabs-container">
      <div className="tab-headers">
        <button
          className={`tab-header ${activeTabIndex === 0 ? 'active' : ''}`}
