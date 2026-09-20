/*
 * Platform: CodeChef
 * Problem ID: REACTCHA02
 * Problem: FilterableList.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/react-js/REACTPRJ01/problems/REACTCHA02
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: REACTPRJ01
 * Status: ACCEPTED
 */

import { useState } from 'react';
import ListItem from './ListItem';

function FilterableList({ items }) {
  const [searchTerm, setSearchTerm] = useState('');

  const filteredItems = items.filter(item => 
    item.name.toLowerCase().includes(searchTerm.toLowerCase()) ||
    item.description.toLowerCase().includes(searchTerm.toLowerCase())
  );
…    </div>
  );
}

export default FilterableList;