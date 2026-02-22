package pkg13_luaskelilinglingkaran;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jariJari, diagram, luas, keliling;
        
        System.out.println("Selamat datang di program mencari luas dan keliling lingkaran");
        System.out.print("Masukan jari jari lingkaran : ");
        jariJari = input.nextDouble();
        System.out.println("============================");
        luas = 22.0/7 * (jariJari * jariJari);
        diagram = jariJari * 2;
        keliling = diagram * 22.0/7;
        System.out.println("Hasil luas lingkaran ialah : 22/7 x " + jariJari + " x " + jariJari + " = " + luas);
        System.out.println("Hasil keliling lingkaran ialah : 22/7 x " + diagram + " = " + keliling);
    }
    
}
