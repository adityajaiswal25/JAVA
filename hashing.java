import java.util.HashSet;
import java.util.Iterator;
public class hashing {
    public static void main(String[]args){
        // Create a HashSet to store unique integers
        HashSet<Integer> set = new HashSet<>();
        //insert elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        //iterate through the set
        System.out.println("Elements in the set:"+set);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //search for an element
        if(set.contains(2)){
            System.out.println("Element 2 is present in the set.");
        } else {
            System.out.println("Element 2 is not present in the set.");
        }
        //size of the set
        System.out.println("Size of the set: " + set.size());
        //remove an element
        set.remove(1);

        //print all elements
        System.out.println("Set contents: " + set);
    }
    
}
