package pkg8_inputdata;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int umur;
        String nama, alamat;
        double berat, tinggi;
        Scanner input = new Scanner(System.in);
        
        //Inputan data
        System.out.println("Selamat data di program inputan");
        System.out.print("Masukan nama anda \t= ");
        nama = input.nextLine();
        System.out.print("Masukan umur anda \t= ");
        umur = input.nextInt();
        System.out.print("Masukan tinggi anda \t= ");
        tinggi = input.nextDouble();
        System.out.print("Masukan berat anda \t= ");
        berat = input.nextDouble();
        System.out.print("Masukan alamat anda \t= ");
        input.nextLine();
        alamat = input.nextLine();
        System.out.println("\n==========================");
        
        //Menampilkan data
        System.out.println("Nama \t: " + nama);
        System.out.println("Umur \t: " + umur);
        System.out.println("Tinggi \t: " + tinggi);
        System.out.println("Berat \t: " + berat);
        System.out.println("Alamat \t: " + alamat);     
    }
}
