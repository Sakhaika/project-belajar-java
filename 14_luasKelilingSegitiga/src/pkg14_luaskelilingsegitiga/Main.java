package pkg14_luaskelilingsegitiga;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double sisi, tinggi, luas, keliling;
        
        System.out.println("Selamat datang di program mencari luas dan keliling segitiga");
        System.out.print("Masukan sisi segitiga : ");
        sisi = input.nextDouble();
        System.out.print("Masukan tinggi segitiga : ");
        tinggi = input.nextDouble();
        System.out.println("=======================");
        luas = 0.5 * sisi * tinggi;
        keliling = 4 * sisi;
        
        System.out.println("Luas sisi segitiga : ");
        System.out.println("Sisi : " + sisi + "cm");
        System.out.println("Luas : " + sisi + " x " + tinggi + " : " + " 2 " + " = " + luas);
        System.out.println("keliling : " + sisi + " x " + " 4 " + " = " + keliling);
    }
    
}
