package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("A değerini giriniz");
        Scanner girdi = new Scanner(System.in);
        int A = girdi.nextInt();
        System.out.println("B değerini giriniz");
        Scanner girdi2 = new Scanner(System.in);
        int B = girdi2.nextInt();
        int deger=0;
        deger=A;
        A=B;
        B=deger;

        System.out.println("A :"+A+" B:"+B);
    }
}
