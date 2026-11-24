public class typecasting {
    public static void main(String[] args) {
        byte a = 55;
        short b;
        b = a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------");

        int c = 98765;
        double e;
        e = c;
        System.out.println(c);
        System.out.println(e);
        System.out.println("------------");

        short f = 55;
        byte g;
        g = (byte) f;
        System.out.println(f);
        System.out.println(g);
        System.out.println("------------");

        double j = 98765.456;
        int k;
        k = (int) j;
        System.out.println(k);
        System.out.println(j);
    }
}
