// as here we are given an sorted array time complexity O(n)

import java.util.ArrayList;
public class PairSum1TwoPointer {

    public static boolean pairSum1(ArrayList<Integer> list,int target) {
        int lp=0;
        int rp=list.size()-1;
        while (list.get(lp)!=list.get(rp)) {
            if (list.get(lp)+list.get(rp)==target) {
                return true;
            }else if (list.get(lp)+list.get(rp)<target) {
                lp++;
            } else if (list.get(lp)+list.get(rp)>target){
                  rp--;
            }
            
            }
            return false;
        }
    
    

    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
          
        System.out.println(pairSum1(list,target));
    }
}
