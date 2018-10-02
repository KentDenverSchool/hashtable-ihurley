import java.util.HashMap;

/**
 * Name: Izzy Hurley
 * Lab Name: HashTableDriver
 * Lab Purpose: The goal of HashTableDriver is to create a program
 * Date: 10/2/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class HashTableDriver {
    public static void main(String[] args) {
        HashTable dict = new HashTable(10);
        System.out.println("Get from an empty table expected result = null");
        System.out.println(dict.get("lemon"));
        System.out.println("Put one = the first number expected result = true");
        System.out.println(dict.put("one","the first number"));
        System.out.println("Print get(one) expected result  = the first number");
        System.out.println(dict.get("one"));

    }
}
