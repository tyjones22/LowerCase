import java.util.*;
public class LowerCase {
    public static void main (String []args){

        Scanner k = new Scanner (System.in);

        System.out.println("Enter text to make lowercase");
        String orginal = k.nextLine();
        String lowercase = orginal.toLowerCase();

        System.out.println(lowercase);
    }
}
