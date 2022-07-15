public class Testssss {

    public static void main(String[] args) {


        int arr[]={2, 3, 6};

        int[] resultArr;
// For
        for(int i=0;i<arr.length-1;i++){
            int values ;
            int result = 0;
            for(int j=i+1;j<arr.length-1;j++){
                result=arr[j] * arr[j+1];
                System.out.println(result);
            }


        }

    }
}
