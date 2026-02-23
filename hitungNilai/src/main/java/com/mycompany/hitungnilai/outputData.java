package com.mycompany.hitungnilai;
// Sakha Ibadil Kirom - 2507411064 - TI 2A
public class outputData {
    double nilai_akhir;
    String nilai_huruf;
    
    void hitungNilai(double formatif, double uts, double uas){
        nilai_akhir = (formatif*0.4) + (uts*0.3) + (uas*0.3);
        
        if(nilai_akhir >= 80) nilai_huruf = "A";
        else if(nilai_akhir >= 70) nilai_huruf = "B";
        else if(nilai_akhir >= 60) nilai_huruf = "C";
        else if(nilai_akhir >= 50) nilai_huruf = "D";
        else nilai_huruf = "E";
    }
    
    void outputHasil(){
        System.out.println("Nilai Akhir : " + nilai_akhir);
        System.out.println("Huruf Mutu : " + nilai_huruf);
    }
}
