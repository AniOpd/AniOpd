import java.util.*;

public class gcd {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int gcd1 = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd1 = i;
            }
        }
        System.out.println(gcd1);
    }
}