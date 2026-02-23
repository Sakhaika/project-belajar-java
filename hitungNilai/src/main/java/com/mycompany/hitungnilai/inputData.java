package com.mycompany.hitungnilai;
// Sakha Ibadil Kirom - 2507411064 - TI 2A
import java.util.Scanner;

public class inputData {
    Scanner input = new Scanner(System.in);
    String nim="", nama="", mata_kuliah="";
    double formatif, uts, uas;
    
    void inputNIM(Scanner input){
        System.out.print("Masukan NIM anda : ");
        nim = input.nextLine();
    }
    void inputNama(Scanner input){
        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();
    }
    void inputMK(Scanner input){
        System.out.print("Masukan mata kuliah : ");
        mata_kuliah = input.nextLine();
    }
    void inputFormatif(Scanner input){
        System.out.print("Nilai formatif : ");
        formatif = input.nextDouble();
    }
    void inputUTS(Scanner input){
        System.out.print("Nilai UTS : ");
        uts = input.nextDouble();
    }
    void inputUAS(Scanner input){
        System.out.print("Nilai UAS : ");
        uas = input.nextDouble();
    }
    
}
