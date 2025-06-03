package Java;
import java.util.Scanner;

public class berpangkat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bil, pangkat, hasil;
        bil = 6;
        pangkat = 2;
        hasil = bil;
        for(int a = 1; a < pangkat; a++ ){
            hasil *= bil;
        }
        System.out.println(hasil);

        /*Contoh */
        int bil1, pangkat1, hasil1;
        System.out.print("Masukkan bilangan = ");
        bil1 = input.nextInt();
        System.out.print("Masukkan pangkat = ");
        pangkat1 = input.nextInt();
        hasil1 = bil1;
        for(int b = 1; b < pangkat1; b++ ){
            hasil1 *= bil1;
        }
        System.out.println("Hasilnya adalah = " + hasil1);

    }
}
