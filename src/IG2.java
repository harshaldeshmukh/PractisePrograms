import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IG2 {
    public static void main(String[] args) {


       int[] a = { 23, 5, 2, 7, 87 };
       int[] b = { 4, 67, 2, 8 };
        ArrayList<Integer> result = new ArrayList<>();
        int idx=0;

       // Output: { 2, 7, 7, 2, 4, 1, 5, 8, 7 }


        for(int i=0;i<a.length;i++){

            if(i!=b.length) {

                for (int j = i; j <= i; j++) {

                    int sum = a[i] + b[j];
                    //System.out.println(sum);
                    int value = sum % 10;
                    int value1 = sum / 10;
                    // System.out.println("Valie  --------------  "+value1);
                    //System.out.println("dfgfsd------------- "+value);

                    if (value1 == 0) {
                        result.add(value);
                    } else {
                        result.add(value1);
                        result.add(value);

                    }

                    result.toArray();


                /*for(Integer kk: result){

                }*/

                }
            }else{
                System.out.println("------------------------");
                int extra=a[i];
                int value = extra % 10;
                int value1 = extra / 10;
                result.add(value1);
                result.add(value);
            }


            System.out.println(result.stream().toList());
        }

    }
}
