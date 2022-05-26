package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("A değerini giriniz");
        Scanner girdi = new Scanner(System.in);
        int A = girdi.nextInt();
        if (A % 2==1){
            System.out.println("Sayi tek sayidir");
        }
        else{
            System.out.println(("Sayi cift sayidir"));
        }
    }
}
