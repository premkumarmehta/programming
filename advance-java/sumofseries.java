// Q1. sum of series: 1+3+5+...+nth term

// import java.util.Scanner;

// public class sumofseries {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter nth value: ");
//         int n = sc.nextInt();

//         int s = 0;

//         for(int i=1; i<=n; i++){
//             if(i%2==1){
//                 s = s+i;
//             }
//         }
//         System.out.println("Sum of series = "+s);

//         sc.close();
//     }
// }


// Q sum of series: 100+90+80+...+nth term

// import java.util.Scanner;

// public class sumofseries {

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter nth term value: ");
//         int n = sc.nextInt();

//         int s = 0;

//         for(int i=100; i>=n; i=i-10){
//             s = s+i;
//         }
//         System.out.println("Sum of series = "+s);

//         sc.close();
//     }
// }


// Q. (1)+(1+2)+(1+2+3)+...+n term

// import java.util.Scanner;

// public class sumofseries {

//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter nth number: ");
//         int n = sc.nextInt();

//         int s = 0;

//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 s = s+j;
//             }
//         }

//         System.out.println("Sum of series: "+s);

//         sc.close();

//     }
// }


// (1)+(1+3)+(1+3+5)+...+ n term

// import java.util.Scanner;

// public class sumofseries {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter n term: ");
//         int n = sc.nextInt();

//         int s = 0;

//         for(int i=1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                s = s+((2*j)-i);
//             }
//         }
//         System.out.println("Sum of Series: "+s);

//         sc.close();

//     }
// }


// Q. sum of series: 1^2 + 2^3 + 3^5+ ... + nth term

// import java.util.*;
// public class sumofseries {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter nth term: ");
//         int n = sc.nextInt();

//         int s = 0;
//         for(int i=1; i<=n; i++){
//             int v = 1;
//             for(int j=1; j<(2*i-1); j++){
//                 v = v*i;
//             }
//             s = s+v;
//         }
//         System.out.println("Sum of series: "+s);
//     }
// }


// 1 + 3^2 + 5^3 + ... + n term

// (1^2)^3 + (2^3)^4 + ... + n term 

// 1! + 2! + 3! + ... + n term

// (1!)^1 + (3!)^2 + (5!)^3 + ... + n term





