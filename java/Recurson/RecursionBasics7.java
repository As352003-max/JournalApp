public class RecursionBasics7 {
    public static int firstOccurence(int arr[],int key,int i){
        if(key==arr.length){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
      return firstOccurence(arr, key ,i+1);

    }

    public static void main(String args[]) {
        int arr[]={1,2,3,6,7,8,9};
        System.out.println(firstOccurence(arr, 6, 0));
    }
}
