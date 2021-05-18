package FizzBuzzResult;

import java.util.Scanner;

public class TestFizzBuzz {
    public static void main(String[] args) {
        FizzBuzzResult fbr = new FizzBuzzResult();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fbr.Check(a));
    }}
