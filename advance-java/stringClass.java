public class stringClass {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        System.out.println("string value = "+s1);
        System.out.println("Length = "+s1.length());
        System.out.println("Char at 0th index = "+s1.charAt(0));

        String s2 = s1.delete(2, 4); // error show
        System.out.println("new string = "+s2);
        char s3[] = s1.toCharArray();
        
        for(int i=0; i<s1.length(); i++){
            System.out.println(s3[i]);
        }
    }
}
