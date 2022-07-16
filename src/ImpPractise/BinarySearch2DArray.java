package ImpPractise;

import java.util.Arrays;

public class BinarySearch2DArray {
    public static void main(String[] args) {
     // Q :- Search element in matrix by normal way
        int bs[][]={
                {1,2,3},
                {4,6,7},
                {8,9,0}};
        int res[] = search(bs,0);
        System.out.println(Arrays.toString(res));
    }

    private  static  int[] search(int arr[][] , int target){
        // i is for row and j is for col
        for(int i=0;i<arr.length;i++){  //un till row length 3
            for (int j=0;j<arr.length;j++){ //un-till col length 3
                if(arr[i][j] == target){
                    return  new int[]{i,j};
                }
            }
        }
        return  new int[]{-1,-1};
    }


}
