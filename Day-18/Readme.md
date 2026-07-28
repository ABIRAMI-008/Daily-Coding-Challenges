# Day 18

## Problem 1

Name: House Robber  
Platform: LeetCode  
Difficulty: Medium

Approach:
- Use Dynamic Programming.
- At each house, choose between robbing the current house (add its value to the maximum from two houses before) or skipping it (keep the previous maximum).
- Keep track of only the previous two maximum values to achieve constant space.

Time Complexity: O(n)

Space Complexity: O(1)

---

## Problem 2

Name: Power of Two  
Platform: LeetCode  
Difficulty: Easy

Approach:
- A power of two has exactly one set bit in its binary representation.
- Check whether `(n & (n - 1)) == 0` and ensure `n > 0`.

Time Complexity: O(1)

Space Complexity: O(1)