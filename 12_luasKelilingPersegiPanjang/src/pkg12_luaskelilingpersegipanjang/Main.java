package pkg12_luaskelilingpersegipanjang;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas, keliling;
        
        System.out.println("Program Luas dan Keliling Persegi Panjang");
        System.out.print("Masukan panjang sisi : ");
        panjang = input.nextInt();
        System.out.print("Masukan lebar sisi : ");
        lebar = input.nextInt();
        luas = panjang * lebar;
        keliling = (panjang + lebar) * 2;
        System.out.println("Hasil Luas = " + panjang + " x " + lebar  + " = " + luas);
        System.out.println("Hasil keliling = " + panjang + " + " + lebar + " x " + " 2 " + " = " + keliling);
    }
    
}
