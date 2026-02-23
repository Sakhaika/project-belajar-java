package com.mycompany.bangundatar;
import java.util.Scanner;

public class segitiga {
    Scanner input = new Scanner(System.in);
    int alas, tinggi, luas;
    
    void hitung_luas(){
        System.out.print("Masukan alas : ");
        alas = input.nextInt();
        System.out.print("\nMasukan alas : ");
        tinggi = input.nextInt();
        luas = (alas * tinggi) / 2;
        System.out.println("Luas : " + luas);
    }
}
