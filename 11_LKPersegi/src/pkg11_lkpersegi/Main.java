package pkg11_lkpersegi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Menghitung luas dan keliling persegi
        /*
        L = s x s
        */
        Scanner input = new Scanner(System.in);
        int s, L, K;
        System.out.print("Masukan nilai sisi : ");
        s = input.nextInt();
        L = s * s;
        K = 4 * s;
        
        // Narasi Luas Persegi
        System.out.println("L = S x S");
        System.out.println("L = " + s + " x " + s);
        System.out.println("L = " + L + "\n");
        
        // Narasi Keliling Persegi
        System.out.println("K = 4 x S");
        System.out.println("K = 4 x " + s);
        System.out.println("K = " + K);
    }
    
}
