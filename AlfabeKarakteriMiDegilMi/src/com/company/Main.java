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
            if (k=='a'|| k=='b'|| k=='c'|| k=='d'|| k=='e'|| k=='f'|| k=='g'|| k=='h'||  k=='i'|| k=='j'|| k=='k'|| k=='l'|| k=='m' || k=='n'|| k=='o'|| k=='p'|| k=='r'|| k=='s'|| k=='t'||k=='u'|| k=='v'|| k=='y'|| k=='z'|| k=='w'|| k=='x'   ) sayac++;
        }
        if(sayac>=1){
            System.out.println(" Alfabe karakteri. ");
        }
        else {
            System.out.println(" Alfabe karakteri değil. ");
        }
    }
}
