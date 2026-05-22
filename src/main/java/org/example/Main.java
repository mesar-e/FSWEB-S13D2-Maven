package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int original = number;
        int reversed = 0;

        while (number > 0) {
            reversed = (reversed * 10) + (number % 10);
            number /= 10;
        }

        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        return false;
    }

    public static String numberToWords(int number) {
        return "";
    }
}