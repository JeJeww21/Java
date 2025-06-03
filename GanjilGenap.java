package Java;

public class GanjilGenap {
    public static void main(String[] args) {
        //Bilangan Genap
        System.out.println("Bilangan genap =");
        for(int a = 1; a <= 10; a++){
            int hasil = a % 2;
            if (hasil == 0) {
                System.out.println(a+"");
            }
        }

        //Bilangan Ganjil
        System.out.println("Bilangan genap =");
        for(int b = 1; b <= 10; b++){
            int hasil = b % 2;
            if (hasil == 0) {
                System.out.println(b+"");
            }
        }
    }
}
