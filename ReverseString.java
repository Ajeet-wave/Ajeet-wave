import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Please input name to reverse");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String reverseString = reverserTheString(a);
        System.out.println(reverseString);

    }

    private static String reverserTheString(String a) {
        String newString="";
        if (!(a == null || a == "" || a == " ")) {
            for (int i = a.length()-1; i >= 0; i--) {
                newString =newString+ a.charAt(i);
            }
        }
        return newString;
    }
}


