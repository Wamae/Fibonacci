package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] memo = new int[n+1];

        for (int i = 0; i < n; i++) {
            System.out.print( fib(i,memo)+",");
        }
    }

    private static int fib(int n,int[] memo) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }else if(memo[n]>0){
            return memo[n];
        } else {
            return fib(n - 1,memo) + fib(n - 2,memo);
        }
    }
}
