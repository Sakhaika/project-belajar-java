package pkg6_escapesquences;
public class Main {
    public static void main(String[] args) {
        String nama = "Sakha Ibadil Kirom";
        int umur = 20;
        double berat = 75.9;
        
        /*
        \t -> tab
        \n -> enter
        \b -> backspace
        */
        
        System.out.println("Nama \t= " + nama + "\nUsia \t= " + umur + " tahun" + "\nBerat \t= " + berat + "kg");
    } 
}
