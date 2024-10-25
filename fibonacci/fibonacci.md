# Fibonacci Sequence in Java and Python Using Recursion

![Fibonacci Sequence](https://miro.medium.com/v2/resize:fit:1100/format:webp/1*PkW4-fRpO_TVt1rF7HeKxQ.jpeg)

Fibonacci Sequence
The Fibonacci sequence is a series of numbers where a number is found by adding up the two numbers before it. Starting with 0 and 1, the sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, and so on.

Mathematically, it's defined as:
.
F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2) (for n ≥ 2)

## 📖 Read the Full Article on Medium

If you want to learn more about how the Fibonacci sequence is implemented with recursion, check out the detailed blog post on Medium:

👉 [Fibonacci Sequence in Java and Python Using Recursion](https://medium.com/@roshannayak5977/fibonacci-sequence-in-java-and-python-using-recursion-e5c1e343e554)

## 🧑‍💻 Code Overview

### Java

The Java implementation uses a recursive approach to calculate the Fibonacci number at a given position. Here's a brief code snippet:

```java
public static int fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

Time Complexity:
O(2^n) — because for every number n, two recursive calls are made to fibonacci(n-1) and fibonacci(n-2).
Space Complexity:
O(n) — because of the depth of the recursive call stack.

🚀 Future Improvements 
Optimized solutions using memoization and dynamic programming.
Add unit tests for both Java and Python implementations.
Explore iterative solutions to the Fibonacci problem.

📄 License
This project is licensed under the MIT License. See the LICENSE file for details.

🙌 Contributions
Contributions, issues, and feature requests are welcome! Feel free to check the issues page.

Happy Coding! 😊


