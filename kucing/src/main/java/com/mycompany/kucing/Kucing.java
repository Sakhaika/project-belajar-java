package com.mycompany.kucing;
// Sakha Ibadil Kirom 2507411064 - TI 2A
public class Kucing {
    String nama;
    String warna;
    
    public Kucing(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }
    
    public void bersuara(){
        System.out.println("Kucing " + this.nama + " yang berwarna " + this.warna + " bilang : Meeeong!");
    }
    
    public static void main(String[] args) {
        // Object
        Kucing KucingPertama = new Kucing("Yanto", "hitam");
        Kucing KucingKedua = new Kucing("Cipa", "putih");
        
        // Menjalankan program
        KucingPertama.bersuara();
        KucingKedua.bersuara();
    }
}
