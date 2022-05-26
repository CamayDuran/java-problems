package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int gecici;
        int [] dizi = new int[10];

        for(int i = 0; i < 3; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
        }
        System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
        for(int i = 0; i < 2; i++)
        {
            for(int j = i+1; j < 3; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }

            System.out.println("en büyük eleman: "  + dizi[2]);

    }
}
