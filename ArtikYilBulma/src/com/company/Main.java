package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter a year: ");
        year= input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + "Artık yıl");
        else
            System.out.println(year + "Artık yıl değil");
    }
}
