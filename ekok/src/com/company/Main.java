package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int max,min,sayi1,sayi2,i,ebob,ekok = 0;
        Scanner sayi=new Scanner(System.in);
        System.out.println("Iki sayi giriniz.");
        sayi1=sayi.nextInt();
        sayi2=sayi.nextInt();
//min ve max sayılar bulunur
        if(sayi1>sayi2)
        {
            max=sayi1;
            min=sayi2;
        }
        else
        {
            max=sayi2;
            min=sayi1;
        }
        for(i=max;i>=1;i--)
        {
            if(max%i==0 && min%i==0)
            {
                ekok=(sayi1*sayi2)/i; //Aslında burada iki sayının çarpımını ebob a bölüyoruz.
                break;
            }
        }
        System.out.println(ekok);
    }
}
