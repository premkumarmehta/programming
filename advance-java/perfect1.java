import java.util.Scanner;

public class perfect1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        int n = sc.nextInt();

        int s = 0;
        int i = 1;
        while (i<=n/2) {
            if(n%i==0){
                s = s+i;
            }
            i++;
        }
        if(n==s)
        System.out.println("Perfect Value");
        else
        System.out.println("Not Perfect Value");

        sc.close();
    }
}
