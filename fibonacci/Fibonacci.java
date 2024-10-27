//we will doing this using recursion..
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("welcome to fibonacci using recursion");
        System.out.println(calculateFibonacci(19));
        // 0,1,1,2,3,5,8
    }

    // think of the recursive tree.. if it
    // fib(3)->fib(2)+fib(1)->fib(1)+fib(0)+fib(1)
    static int calculateFibonacci(int num) {
        // base condition
        if (num <= 1)
            return num;
        return calculateFibonacci(num - 1) + calculateFibonacci(num - 2);
    }

}