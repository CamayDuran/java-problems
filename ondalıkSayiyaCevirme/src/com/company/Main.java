package com.company;

import java.util.Scanner;

public class Main {
static public void binaryDonustur(int sayi){
    int binary[]=new int[40];
    int index=0;
    while (sayi>0){
        binary[index++] = sayi%2;
        sayi = sayi/2;
    }
    for(int i = index-1;i >= 0;i--){
        System.out.print(binary[i]);
    }
}
    public static void main(String[] args) {
	// write your code here
        Scanner girdi = new Scanner(System.in);
        int sonuc = girdi.nextInt();
        binaryDonustur(sonuc);
        System.out.print("\n18: ");
        binaryDonustur(18);
        System.out.print("\n");
    }
}
