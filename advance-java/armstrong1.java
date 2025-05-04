import java.util.Scanner;

public class armstrong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer value: ");
        int n = sc.nextInt();

        int m, r, s=0, digit = 0;
        m=n;

        while (m!=0) {
            m = m/10;
            digit++;
        }
        m=n;
        while (n!=0) {
            r = n%10;
            n = n/10;
            int i=1, f=1;
            while (i<=digit) {
                f = f*r;
                i++;
            }
            s = s+f;
        }
        if(s==m)
        System.out.println(s + " is Armstrong Value");
        else
        System.out.println(s + " is not a Armstrong value");

        sc.close();
    }
}
