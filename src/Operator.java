public class Operator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        int sum = x + y;
        int sub = x - y;
        int div = x / y;
        int mul = x * y;
        int mod = x % y;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);
        System.out.println(mod);

        // So thuc;
        float f1 = 3.5f;
        float f2 = 4.5f;
        float sumF = f1 + f2;

        System.out.println(sumF);

        // Nang kieu (tu dong);
        byte a = 5;
        short b = 10;
        int c = 15;
        long d = 20l;

        long sumL = a + b + c + d;
        System.out.println(sumL);

        // Ep kieu xuong bang tay;
        int sumI = a + b + c + (int) d;
        System.out.println(sumI);

        double d1 = 2.5;
        double sumD = sumL + d1;
        System.out.println(sumD);

        // Ep xuong value tu lam tron xuong;
        long sumL1 = (long) d1 + d;
        System.out.println(sumL1);

    }
}
