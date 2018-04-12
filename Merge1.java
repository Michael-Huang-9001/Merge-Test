public class Merge1 {

    public static void main(String[] args) {
        System.out.println(test1(1,2));
        System.out.println(test2(1,2));
    }

    public static int test1(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int test2(int c, int d) {
        int product = c * d;
        return product;
    }
}
