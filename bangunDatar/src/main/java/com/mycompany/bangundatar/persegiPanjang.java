package com.mycompany.bangundatar;
import java.util.Scanner;

public class persegiPanjang {
    Scanner input = new Scanner(System.in);
    int panjang, lebar, luas;
    
    void hitung_luas(){
        System.out.print("Masukan panjang \t: ");
        panjang = input.nextInt();
        System.out.print("Masukan lebar \t\t: ");
        lebar = input.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang \t: " + luas);
    }
}
