package Java;
import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int menu;

        System.out.println("Menu");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Nasi Ayam");
        System.out.print("Input menu = ");
        menu = input.nextInt();

        if (menu == 1) {
            System.out.println("Saya memilih nasi goreng");
        }
        else if (menu == 2) {
            System.out.println("Saya memilih ayam goreng");
        }
        else {
            System.out.println("System tidak ada");
        }
    }
}
