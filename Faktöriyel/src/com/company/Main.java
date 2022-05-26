package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in);
        System.out.print("Bir Sayı Girin:");

        int num = reader.nextInt();
        long faktoriyel = 1;
        for(int i = 1; i <= num; ++i)
        {
            faktoriyel *= i;
        }
        System.out.printf("%d Sayısının Faktöriyeli = %d \n", num, faktoriyel);
    }
}
