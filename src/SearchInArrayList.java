import java.util.ArrayList;
import java.util.Arrays;

public class SearchInArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(90);


        list= sorty(list);
        System.out.println(list);

    }

    private static ArrayList<Integer> sorty(ArrayList<Integer> arr){
        int v2;
        int v1;
            for(int i=0;i<arr.size();i++){

                for(int j=1 ; j<arr.size()-i; j++){
                     v1=arr.get(j-1);
                    v2=arr.get(j);

                    if(v2 < v1){
                        int temp =arr.get(j);
                        v2=v1;
                        v1=temp;
                    }

                }
            }
            return  arr;
        }

}
