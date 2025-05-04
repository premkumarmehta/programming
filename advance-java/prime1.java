// check prime number or not

// import java.util.Scanner;

// public class prime1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter any integer value: ");
//         int n = sc.nextInt();

//         int i=2, flag=0;
//         while (i<=n/2) {
//             if(n%i==0){
//                 flag=1;
//                 break;
//             }
//             i++;
//         }
//         if(flag==0)
//         System.out.println(n + " is a Prime");
//         else
//         System.out.println(n + " is a Not Prime");

//         sc.close();
//     }
// }


// generate prime number from 10 to 1000.

public class prime1 {

    public static void main(String[] args) {
        int i=10;
        while (i<=1000) {
            int n=i, j=2;
            boolean flag=true;
            while (j<=n/2 && flag==true) {
                if(n%j==0){
                    flag=false;
                }
                j++;
            }
            if(flag)
            System.out.println(n);
            i++;
        }
    }
}
