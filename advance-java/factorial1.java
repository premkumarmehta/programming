import java.util.*;
public class factorial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int n = sc.nextInt();

        int f = 1;

        while (n>1) {
            f = f*n;
            n--;
        }
        System.out.println("Factorial value: "+f);

        sc.close();
    }
}
