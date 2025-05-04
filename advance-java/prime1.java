import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any integer value: ");
        int n = sc.nextInt();

        int i=2, flag=0;
        while (i<=n/2) {
            if(n%i==0){
                flag=1;
                break;
            }
            i++;
        }
        if(flag==0)
        System.out.println(n + " is a Prime");
        else
        System.out.println(n + " is a Not Prime");

        sc.close();
    }
}
