import  java.util.ArrayList;
import java.util.Collections;
public class SortingList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list= new ArrayList<>();
        list.add(15);
        list.add(24);
        list.add(3);
        list.add(42);
        list.add(1);
        list.add(6);
        System.out.println(list);

        // ascending order
        Collections.sort(list);
        System.out.println(list);

        // descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
