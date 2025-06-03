package Java;
import java.util.Scanner;

public class ifketuntasan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String Matkul;
        int KKM;

        System.out.println("Masukkan Matkul");
        System.out.println("1. Design Thinking");
        System.out.println("2. Basic Programming");
        System.out.print("Masukkan Matkul = ");
        Matkul = input.nextLine();
        System.out.print("Masukkan Nilai = ");
        KKM = input.nextInt();

        if (KKM >= 60) {
            System.out.println("Selamat! anda lulus");
        }
        else if (KKM <= 60) {
            System.out.println("Sayang sekali! anda gagal");
        }
        else {
            System.out.println("Invalid");
        }

    }
}
