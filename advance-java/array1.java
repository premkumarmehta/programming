import java.util.Scanner;

public class array1 {

    int n[], size;

    void setSize(int t){
        size = t;
        n = new int[size];
    }

    // input array element

    void input(int i, int v){
        n[i]=v;
    }

    // displaying array element

    void display(){
        System.out.println("Array values: ");
        for(int i=0; i<size; i++){
            System.out.print(n[i]+"\t");
        }
    }

    // searching an array element

    void search(int item){
        boolean flag = false;
        for(int i = 0; i<size; i++){
            if(item==n[i]){
                flag = true;
                break;
            }
        }

        if(flag)
        System.out.println("Item exist in the list");
        else
        System.out.println("Item does not exit in the list");
    }

    // arranging in decending order

    void arrange(){
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(n[i]<n[j]){
                    int t = n[i];
                    n[i]=n[j];
                    n[i]=t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        array1 x = new array1();

        System.out.println("\nEnter size of the array: ");
        int as = sc.nextInt();

        x.setSize(as);

        for(int i=0; i<as; i++){
            System.out.println("\nEnter a value: ");
            int v = sc.nextInt();
            x.input(i, v);
        }

        System.out.println("\nMy accepted array values are : ");
        x.display();

        System.out.println("\nEnter a value for searching in the list: ");
        int m = sc.nextInt();

        x.search(m);

        System.out.println("\nAfter sorting/arranging in decending order: ");
        x.arrange();
        x.display();

        sc.close();
    }
}
