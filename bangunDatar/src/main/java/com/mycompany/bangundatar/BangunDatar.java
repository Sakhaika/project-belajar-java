package com.mycompany.bangundatar;
import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        int menu = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nAplikasi Bangun datar ... : ");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Keluar");  
        
        System.out.print("Masukan pilihan menu : ");
        menu = input.nextInt();
        
        switch(menu){
            case 1:{
                persegi persegi = new persegi();
                persegi.hitung_luas();
                break;
            }
            case 2:{
                persegiPanjang persegiPanjang = new persegiPanjang();
                persegiPanjang.hitung_luas();
                break;
            }
            case 3:{
                segitiga segitiga = new segitiga();
                segitiga.hitung_luas();
                break;
            }
            case 4:{
                System.out.println("Program keluar");
                break;
            }
            default:{
                System.out.println("\nAnda salah memilih menu ... ");
                break;
            }
        }
        input.close();
    }
}
