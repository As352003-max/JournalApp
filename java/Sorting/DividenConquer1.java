public class DividenConquer1 {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
       } 

       public static void quickSort(int arr[],int si,int ei){
        if (si>=ei ) {
            return;
        }
        // last element
        int pidx=partition(arr,si,ei);
        // left part
        quickSort(arr,si,pidx-1);
        // right part
        quickSort(arr,pidx+1,ei);
       }

       public static int partition(int arr[], int si,int ei ) {
        int pivot=arr[ei];
        int i=si-1;
        // i will make space for element smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j]<=pivot) {
                i++;
                // swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
                // swap
                int temp=pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;
       }

       public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        quickSort(arr,0,arr.length-1);
        printArray(arr); 
       }
}
