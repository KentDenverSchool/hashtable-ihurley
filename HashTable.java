import java.util.ArrayList;
import java.util.Collection;

/**
 * Name: Izzy Hurley
 * Lab Name: HashTable
 * Lab Purpose: The goal of HashTable is to create a program
 * Date: 10/2/18
 * Collaborators: None
 * ON MY HONOR: IH
 */
/* Which is a better hashfunction:
 x % n where n is a large number with several factors
 x % n where n is a large prime number Prove your answer with a simple example.
          where x%n is large prime number better hash fucntion is created because it will re
            result in many fewer collisions

            61%12 = 1               60%12 = 0
            67%12 = 7               62%12 = 2 \_
            71%12 = 11              74%12 = 2 / THESE ARE THE SAME
PRIMES DO NOT RETURN THE SAME

Is char values summed % 599 a good hash function for strings? Why or why not?
- 599 is prime but it will return a predictable function and result in collisions for words containing the same charectars(regardless of order)
or will result in the same value with the same chars doubled

You take the result of each character snd multiply it by 31 and then add it to the total result
 for (Object element : a)
            result = 31 * result + (element == null ? 0 : element.hashCode());

        return result;


 */


public class HashTable {
    String [] a;
    public HashTable(int capacity){
         a = new String[capacity];
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        int index = hashCode(key);
        if (a[index] == null){
       a[index] = value;
        return true;}
       else return false;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        int index = hashCode(key);
        return a[index];
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){
       return key.hashCode()%a.length;
    }


}
