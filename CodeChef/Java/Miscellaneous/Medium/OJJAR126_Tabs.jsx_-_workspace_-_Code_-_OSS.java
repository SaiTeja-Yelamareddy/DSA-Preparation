/*
 * Platform: CodeChef
 * Problem ID: OJJAR126
 * Problem: Tabs.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA75/problems/OJJAR126
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA75
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
