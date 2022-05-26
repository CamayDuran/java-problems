package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner girdi = new Scanner(System.in);

        int toplam = 0, sayi = 0;

        for (int i = 0; 10> i; i++){

            System.out.print("Bir sayı giriniz: ");

            sayi = girdi.nextInt();

            toplam = toplam + sayi;

        }

        System.out.println("Sayıların Toplamı: "+toplam);
    }
}
