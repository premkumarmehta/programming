public class ifElse {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

        if(a/2==1)
        System.out.println(a+ " is odd");
        else
        System.out.println(a+ " is even");

        int g = a;

        if(a>b){
            if(a>c)
            g=a;
            else
            g=c;
        }
        else{
            if(b>c)
            g=b;
            else
            g=c;
        }

        System.out.println("A greatest value = "+g);

        int s = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        System.out.println("Greatest value: "+s);
    }
}
