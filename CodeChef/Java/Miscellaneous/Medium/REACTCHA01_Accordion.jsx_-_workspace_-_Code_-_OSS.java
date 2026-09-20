/*
 * Platform: CodeChef
 * Problem ID: REACTCHA01
 * Problem: Accordion.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/REACTPRJ01/problems/REACTCHA01
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: REACTPRJ01
 * Status: ACCEPTED
 */

import { useState } from 'react';
import AccordionItem from './AccordionItem';

function Accordion({ items }) {
  const [activeIndex, setActiveIndex] = useState(null);

  const handleItemClick = (index) => {
    // Toggle: if clicking the currently active item, close it
    // Otherwise, set the clicked index as active
    setActiveIndex(activeIndex === index ? null : index);
…          onClick={() => handleItemClick(index)}
        />
      ))}
    </div>
  );
}

export default Accordion;