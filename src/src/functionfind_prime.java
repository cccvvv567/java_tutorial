public class functionfind_prime {

    public static void main(String[] args) {
        int n = calc(100);
        System.out.println(n);
    }

    static int calc(int n) {
        int i;
        for (i = 2; i < n ; i++) {
            for (n = 2; n < i; n++) {
                if (i % n == 0)
                    break;
            }
            if (n == i);
        }
        return n;
    }
}