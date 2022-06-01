import java.util.Arrays;

public class BinarySearch2DArraySortedArray {
    public static void main(String[] args) {
     //Q : Search in sorted matrix

        int bs[][]={
                {10,20,30},
                {40,60,70},
                {80,90,100}};
        //https://www.youtube.com/watch?v=enI_KyGLYPo
        //case 1: if target == element
        //case 2: if target < element
        //case 2: if target > element

        // How to reduce the search space in case of sorted 2D array.
        //So basically we just have to consider last column as a UB and 0th row ad LB

        /*int bs[][]={
          10->LB  10,20,30}, 30-> UB
                {40,60,70},
                {80,90,100}};*/
        int result[]=search(bs,90);
        System.out.println(Arrays.toString(result));


    }

    private static  int[] search(int[][] arr, int target){
        int r=0;
        int c=arr.length-1;
        while (r< arr.length && c>=0){

            if(arr[r][c]==target){
                return  new int[]{r,c};
            }
            if(arr[r][c] < target){
                r++;
            }else {
                c --;
            }
        }
        return  new int[]{-1,-1};
    }
}
