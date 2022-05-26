package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String metin;

        char k;
        int sayac = 0;
        int i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Harfi giriniz: ");
        metin = scan.nextLine();

        for(i=0; i<metin.length(); i++) {
            k = metin.charAt(i);
            if (k=='a'|| k=='e'|| k=='ı'|| k=='i'|| k=='o'|| k=='ö'|| k=='u'|| k=='ü' ) sayac++;
        }
        if(sayac>=1){
        System.out.println(" Sesli harf girdiniz.");
        }
        else {
            System.out.println(" Sessiz harf girdiniz.");
        }
    }
}
