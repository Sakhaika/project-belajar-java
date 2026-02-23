package com.mycompany.hitungnilai;
// Sakha Ibadil Kirom - 2507411064 - TI 2A
import java.util.Scanner;
public class HitungNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nBiodata Mahasiswa");
        inputData masukan = new inputData();
        masukan.inputNIM(input);
        masukan.inputNama(input);
        masukan.inputMK(input);
        
        System.out.println("\nAn." + masukan.nama);
        masukan.inputFormatif(input);
        masukan.inputUTS(input);
        masukan.inputUAS(input);
        
        outputData output = new outputData();
        output.hitungNilai(masukan.formatif, masukan.uts, masukan.uas);
        
        System.out.println("\nAn." + masukan.nama);
        output.outputHasil();
        
        input.close();
            
    }
}
