package BinaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SampleDemo {

    public static void main(String[] args) {


        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 2;
        int resultSynArray[] = {};

        sumOfSubarray(k, arr, resultSynArray);

    }

    private static void sumOfSubarray(int k, int[] arr, int[] resultSynArray) {
        int sum = 0;
        int idx = 0;
        int prevSum = 0;
        Map<Integer, String> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        resultSynArray= new int[k];
        int prevSum1 = 0;

        for (int i = 0; i < arr.length; i++) {
          
            for (int j = i; j < k ; j++) {
                System.out.println(arr[j] + "  ---");
                arrayList.add(arr[j]);
                resultSynArray[idx]=arr[j];
                sum += arr[j];
                idx++;

                prevSum=sum;
            }

            System.out.println("Final Sum od one SubArray  " + sum);
            System.out.println("Final Sum od one SubArray  " + Arrays.toString(resultSynArray));
            System.out.println("previousSum    " + prevSum);
            System.out.println("previousSum    " + prevSum1);
           // previousSum = sum;
            idx=0;
            map.put(sum, Arrays.toString(resultSynArray));
            for (Map.Entry<Integer,String> entry : map.entrySet())
                System.out.println("Key = " + entry.getKey() +
                        ", Value = " + entry.getValue());
              sum = 0;

    }
    }

}
