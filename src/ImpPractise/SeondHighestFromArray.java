package ImpPractise;

public class SeondHighestFromArray {

    public static void main(String[] args) {
        int[] array = {0,12,74,26,82,176,8,55,3,189};

        int highest=0;
        int secondHighest=0;


        for(int i=0;i<array.length;i++){

            if(array[i] > highest){

                secondHighest= highest;
                highest= array[i];
            }else if(  array[i] >= secondHighest){
                secondHighest= array[i];

            }
        }
        System.out.println(highest);
        System.out.println(secondHighest);
    }
}
