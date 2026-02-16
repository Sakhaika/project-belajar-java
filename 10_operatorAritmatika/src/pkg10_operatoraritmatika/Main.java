package pkg10_operatoraritmatika;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;
        double angka3;
        
        System.out.println("Selamat datang di program aritmatika");
        System.out.print("Masukan angka pertama \t: ");
        angka1 = input.nextInt();
        System.out.print("Masukan angka kedua \t: ");
        angka2 = input.nextInt();
        
        angka3 = angka1 + angka2;
        System.out.println("Hasil penjumlahan dari " + angka1 + " + " + angka2 + " iyalah \t: " + angka3);
        angka3 = angka1 - angka2;
        System.out.println("Hasil pengurangan dari " + angka1 + " - " + angka2 + " iyalah \t: " + angka3);
        angka3 = angka1 * angka2;
        System.out.println("Hasil dari perkalian dari " + angka1 + " x " + angka2 + " iyalah : " + angka3);
        angka3 = angka1 / angka2;
        System.out.println("Hasil dari pembagian dari " + angka1 + " : " + angka2 + " iyalah : " + angka3);
        angka3 = angka1 % angka2;
        System.out.println("Hasil dari modulus dari " + angka1 + " % " + angka2 + " iyalah : " + angka3);
    }
}
    