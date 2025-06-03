package Java;
import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka = 3;
        int hasil = angka;
        System.out.print(angka+"! = ");
        for(int i = angka; i > 0; i-- ){
            System.out.print(i);
            if (i > 1) {
              System.out.print(" * ");  
            }
            if (angka != i) {
                hasil *=i;
            }
            hasil *= 1;
        }
        System.out.println("");
        System.out.println("   = " + hasil);


        /*Contoh  */
        System.out.print("Masukkan Angka = ");
        int angka1 = input.nextInt();
        int hasil1 = angka1;
        System.out.print(angka1+"! = ");
        for(int h = angka1; h > 0; h-- ){
            System.out.print(h);
            if (h > 1) {
              System.out.print(" * ");  
            }
            if (angka1 != h) {
                hasil1 *=h;
            }
            hasil1 *= 1;
        }
        System.out.println("");
        System.out.println("   = " + hasil1);

    }
}
