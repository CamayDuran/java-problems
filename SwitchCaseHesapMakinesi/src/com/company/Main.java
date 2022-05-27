package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");

        System.out.print("Secimininizi giriniz: ");
        int secim = scan.nextInt();

        switch(secim) {
            case 1:
                System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma isleminin sonucu = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bölme isleminin sonucu = " + (float)sayi1 / sayi2);
        }
        System.out.println("****İSLEME NASIL DEVAM ETMEK İSTEDİĞİNİZİ SEÇİNİZ***");
        System.out.println("1. ENTER");
        System.out.println("2. CLEAR");

        System.out.print("Secimininizi giriniz: ");
        int secim2 = scan.nextInt();

        switch(secim2) {
            case 1:
                System.out.println("İşleminiz burda sonuçlanmıştır " );
                break;
            case 2:
                System.out.println("Yapmak istegiğiniz yeni işlemi seçebilirsiniz" );
                break;

        }
    }
}
