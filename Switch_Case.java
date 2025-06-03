package Java;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String menu;
        int porsi;
        int totalporsi;

        System.out.println("Pilih Menu");
        System.out.println("1. Mie Rendang");
        System.out.println("2. Mi Aceh");
        System.out.print("Pilih menu = ");
        menu = input.nextLine();
        
        switch (menu) {
            case "1":
                System.out.println("Harga = " + 10000);
                System.out.print("Porsi = ");
                porsi = input.nextInt();
                System.out.println("Harga = " + 10000 * porsi);
                break;

            case "2":
                System.out.println("Harga = " + 15000);
                System.out.print("Porsi = ");
                porsi = input.nextInt();
                System.out.println("Harga = " + 15000 * porsi);
                break;
        
            default:
            System.out.println("Data tidak valid!");
                break;
        }
    }
}
