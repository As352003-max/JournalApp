
import java.util.ArrayList;
public class MaxinList {
        public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(4);
        list.add(35);
        list.add(6);
        list.add(32);

        int max=Integer.MIN_VALUE;
        for (int i = 0; i< list.size(); i++) {
            // 1st method
            // if (max<list.get(i)) {
            //     max=list.get(i);
            // }

            // 2nd method
            max=Math.max(max,list.get(i));
            // isme Math max find karne ka operation laga hai max aur list ke element me comparision hoga jo bada hua vo print hoga
        }

        System.out.print("Max element="+max);
}
}
