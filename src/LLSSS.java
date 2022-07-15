public class LLSSS {

    /*static class Node{
        int val;
        Node node;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node node) {
            this.val = val;
            this.node = node;
        }
    }*/

    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        int highest;
        int secondhighest=0;

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length;j++){

                if(arr[i] > arr[j]){
                    highest=arr[i];
                    secondhighest=arr[j];
                }
            }

           /* if(arr[i] > arr[i+1]){
                highest=arr[i];
                secondhighest=arr[i+1];

            }else {

            }*/


        }
    }
}


//select count(*),emp_id from employee where emp_id is not null group by emp_id;
