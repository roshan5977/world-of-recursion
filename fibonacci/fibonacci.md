Fibonacci Sequence
The Fibonacci sequence is a series of numbers where a number is found by adding up the two numbers before it. Starting with 0 and 1, the sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, and so on.

Mathematically, it's defined as:

F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2) (for n ≥ 2)


Explanation:
The fibonacci function takes an integer n as input.
If n is 0 or 1, it directly returns the corresponding Fibonacci number (base cases).
For larger values of n, it calls itself recursively to calculate fibonacci(n-1) and fibonacci(n-2), and then adds them together.


Time Complexity:
O(2^n) — because for every number n, two recursive calls are made to fibonacci(n-1) and fibonacci(n-2).
Space Complexity:
O(n) — because of the depth of the recursive call stack.