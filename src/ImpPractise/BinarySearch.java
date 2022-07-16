package ImpPractise;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        search(arr,10);

    }

    private  static int search(int arr[] ,int target){
        //so here first I need to find th mid of array  n according to that we can traverse the array to Left or right
        int start=0;
        int end=arr.length-1;
        int mid = start + end / 2;
        System.out.println(mid);

        while (start < end){
            if(target < arr[mid]){
                end= mid-1;
            }else if(target > arr[mid]){
                start=mid+1;
            }else{
                return  mid;
            }
        }
        return  -1;
    }
}
