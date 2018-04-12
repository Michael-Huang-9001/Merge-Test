public class Merge1 {

    public static void main(String[] args) {
        System.out.println(test1(1, 2));
        System.out.println(test2(1, 2));
    }

    public static int test1(int a, int b) {
        int sum = a + b;
        sum += 1;
        sum -= 1 * 8 - 7 + 77;
        sum -= 1 * 8 - 7 + 77;
        return sum;
    }

    public static int test2(int a, int b) {
        int product = a * b;
        product += 1;
        product -= 1;
        return product;
    }
}
