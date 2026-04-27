I practing java basic to advance from hacker rank and posting solution and commiting daily to deciplin my self

---

## Daily Problem Solving — Problem #15

### Problem
Given a list of item prices and a budget, count the number of index pairs \((i, j)\) with \(i < j\) such that:

\[
prices[i] + prices[j] \le budget
\]

### Solution
This problem's Java solution is in `src/main/java/CountAffordablePairs.java` with the core logic implemented in:

- `Result.countAffordablePairs(List<Integer> prices, int budget)`

### Complexity
- Time: \(O(n^2)\) (checks all pairs)
- Space: \(O(1)\) extra space (excluding input storage)

### Run locally
Compile:
- `javac src/main/java/CountAffordablePairs.java`

Run (example using stdin):
- `type input.txt | java -cp src/main/java CountAffordablePairs`
