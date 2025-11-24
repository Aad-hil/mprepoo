package com.demo.nov24;

import java.util.function.*;

class Hello {
    public String sayHello() {
        return "hello";
    }
}

class NumberUtil1 {

    // Check if a number is even
    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Check if a number is odd
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    // Find the maximum of two numbers
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Find the minimum of two numbers
    public int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // Calculate factorial
    public long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative numbers not allowed");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public void printNum(int[] arr) {
        for (int i : arr)
            System.out.println(i);
    }

    public void filter(String[] arr) {
        for (String i : arr)
            if (i.contains("A")) {
                System.out.println(i);
            }
    }

    public void salwithbonus(Employee[] arr) {
        for (Employee e : arr) {
            System.out.println(e.toString() + ", Bonus given " + e.salary * 0.10);
        }
    }

    public boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

public class DemoObjectMethodRefrenece {

    public static void main(String[] args) {
        String myname = "he";
        Supplier<Integer> len = () -> myname.length();
        Supplier<Integer> lenMR = myname::length;
//        System.out.println(len.get());
//        System.out.println(lenMR.get());

        Hello h = new Hello();
        Supplier<String> hello = () -> h.sayHello();
        Supplier<String> helloMR = h::sayHello;
//        System.out.println(hello.get());
//        System.out.println(helloMR.get());

        NumberUtil1 nu = new NumberUtil1();
        int arr[] = { 13, 23, 4, 5, 223, 52, 15, 5689, 34, 1010, 232, 32, 335, 3, 34444 };

        Function<Integer, Boolean> iseven = nu::isEven;
        Function<Integer, Boolean> isodd = nu::isOdd;
        BiFunction<Integer, Integer, Integer> maxFunc = nu::max;
        BiFunction<Integer, Integer, Integer> minFunc = nu::min;
        Function<Integer, Long> factorialFunc = nu::factorial;
        Function<Integer, Boolean> isprime = nu::isPrime;
        Consumer<int[]> printarr = nu::printNum;

//        System.out.println("Is 10 even? " + iseven.apply(10));
//        System.out.println("Is 7 odd? " + isodd.apply(7));
//        System.out.println("Max of 5 and 9: " + maxFunc.apply(5, 9));
//        System.out.println("Min of 5 and 9: " + minFunc.apply(5, 9));
//        System.out.println("Factorial of 5: " + factorialFunc.apply(5));
//        System.out.println("Is 13 prime? " + isprime.apply(13));
//        printarr.accept(arr);

        Employee[] employees = {
            new Employee("Alice", 50000), new Employee("Bob", 70000),
            new Employee("Charlie", 60000), new Employee("David", 55000),
            new Employee("Eva", 80000), new Employee("Grace", 72000),
            new Employee("Helen", 58000), new Employee("Frank", 65000)
        };

        String[] fruits = { "Apple", "Banana", "Cherry", "Mango", "Orange" };
        Consumer<String[]> filterA = nu::filter;
        filterA.accept(fruits);

        Consumer<Employee[]> printbon = nu::salwithbonus;
        printbon.accept(employees);

        
        System.out.println("Password valid? " + nu.isValidPassword("Abc@1234")); 
        System.out.println("Password valid? " + nu.isValidPassword("abc123"));   
    }
}
