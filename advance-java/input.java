import java.util.Scanner; // scanner -> '*' for all
public class input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Primitive Data type

        System.out.println("Enter byte value: ");
        byte b = sc.nextByte();

        System.out.println("Enter short value: ");
        short s = sc.nextShort();

        System.out.println("Enter int value: ");
        int i = sc.nextInt();

        System.out.println("Enter long value: ");
        long l = sc.nextLong();

        System.out.println("Enter float value: ");
        float f = sc.nextFloat();

        System.out.println("Enter double value: ");
        double d = sc.nextDouble();

        System.out.println("Enter boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // Non-Primitive Types

        sc.nextLine(); // consume leftover newline

        System.out.println("Enter a single character: ");
        char c = sc.nextLine().charAt(0); // no direct nextChar()

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // output

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + c);
        System.out.println("String: " + str);

        sc.close(); // done using a Scanner object (best practice).
    }
}