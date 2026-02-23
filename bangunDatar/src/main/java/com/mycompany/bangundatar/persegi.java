package com.mycompany.bangundatar;
import java.util.Scanner;

public class persegi {
    int sisi, luas;
    Scanner input = new Scanner(System.in);
    
    void hitung_luas(){
        System.out.print("Masukan sisi : ");
        sisi = input.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas Persegi : " + luas);
    }
}
