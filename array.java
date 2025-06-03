package Java;

public class array {
    public static void main(String[] args) {

        /*1 Dimensi */
        int []a = {4,7,9};
        System.out.println(a[0]);

        String[] Makanan = {"Steak", "Garam Madu"};
        System.out.println(Makanan[0]);

        /*Looping array */
        int []b = {1,2,6,8};
        int jml = b.length;
        for (int i = 0; i < jml; i++){
            System.out.println(b[i]);
        }
        System.out.println(" ");
    }
}
