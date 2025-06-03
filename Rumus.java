package Java;

public class rumus {
    public static void main(String[] args) {
        /* Rumus Persegi
        *  L = s * s
        *  K = 4 * s
        */
        int s = 4;
        int s1 = 16;
        int L,K;

        System.out.println("Rumus Persegi");
        System.out.println("L = " + s * s);
        System.out.println("K = " +  4 * s1 );

        /* Rumus Persegi panjang
         * L = p * l
         * K = 2 * (p + l)
        */

        int p = 5;
        int l = 7;
        int L1,K1;

        System.out.println("\nRumus Persegi Panjang");
        System.out.println("L = " + p * l );
        System.out.println("K = " + 2 * (p + l));

        /* Rumus Lingkaran
         * L = phi * r * r
         * K = phi * d
         * d = 2 * r
        */

        int L2,K2;
        int d = 0;
        int r = 6;
        final double phi = 3.14;

        System.out.println("Rumus Lingkaran");
        System.out.println("L = " + phi * r * r);
        System.out.println(" K = " + phi * d);
        System.out.println(d = 2 * r);

        /* Rumus segitiga sama kaki
         * L = 0.5 * a * t
         * K = s + s + s
         */

        int L3,K3;
        int a = 8;
        int t = 4;
        int s3 = 4;

        System.out.println("Rumus Segitiga");
        System.out.println("L = " + 0.5 * a * t );
        System.out.println("K = " + s3 * s3 * s3);

        
    }
}
