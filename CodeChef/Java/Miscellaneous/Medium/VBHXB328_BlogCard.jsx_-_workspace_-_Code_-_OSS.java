/*
 * Platform: CodeChef
 * Problem ID: VBHXB328
 * Problem: BlogCard.jsx - workspace - Code - OSS
 * Problem Link: https://www.codechef.com/learn/course/vasavi-v23csse03-fsd-2026/JHASDA137/problems/VBHXB328
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: Vasavi V23csse03 Fsd 2026
 * Module: JHASDA137
 * Status: ACCEPTED
 */

import React from 'react';
import { formatDate } from '../utils/dateUtils'; // Assuming a format helper is available

function BlogCard({ blog }) {
  return (
      <div className="blog-card">
            <h3>{blog.title}</h3>
                  <p className="blog-author">By {blog.author}</p>
                        <p className="blog-date">Published on {formatDate(blog.createdAt)}</p>
                              <p className="blog-content">
                                      {blog.content.l…? `${blog.content.substring(0, 150)}...` 
                                                          : blog.content}
                                                                </p>
                                                                    </div>
                                                                      );
                                                                      }

                                                                      export default BlogCard;
                                                                                                                              