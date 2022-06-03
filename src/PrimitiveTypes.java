public class PrimitiveTypes {
    public static void main(String[] args) {
        byte a = -120;
        short b = 32000;
        int c = 21000000 / a;
        long d = c * 920000L;
        double e = 306.1;
        float f = 3.14f;
        char ch1 = 'a';
        boolean b1 = true;
        boolean b2 = (a > b) && b1;

        System.out.println("Result1: " + (a + b));
        System.out.println("Result2: " + (c - b));
        System.out.println("Result3: " + (c / f));
        System.out.println("Result4: " + (b % a));
        System.out.println("Result5: " + (d + c));
        System.out.println("Result6: " + (e * f));
        System.out.println("Result7: " + (a - ch1));

        System.out.println("Result8: " + b2);
        System.out.println("Result9: " + ((c >= a) || (d < c) && (e == b * f)));

        System.out.println("Result10: " + (Short.MAX_VALUE + b));
        System.out.println("Result11: " + (Short.MIN_VALUE - b));
    }
}
