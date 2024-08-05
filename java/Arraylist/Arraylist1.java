import java.util.ArrayList;
public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // ArrayList<String> list2=new ArrayList<>();
        // ArrayList<Boolean> list3=new ArrayList<>();
    
        // to add elements in list we write
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // get elements
        int element=list.get(2);
        System.out.println(element);

        // to remove or delete elements
        list.remove(3);
        System.out.println(list);

        // to set an element at an index
        list.set(2,20);
        System.out.println(list);

        // contains check whether the element is present or not
        System.out.println(list.contains(20));


    }
}
