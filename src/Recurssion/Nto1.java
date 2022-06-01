package Recurssion;

public class Nto1 {
    public static void main(String[] args) {
        // Print no from 1 to 5 using recurssion
        fun(5);
        funRev(5);
    }

    private static void fun(int i) {

        if(i==0){
            return;
        }
        fun(i-1);
        System.out.println(i);
    }

    private static void funRev(int i) {

        if(i==0){
            return;
        }
        fun(i-1);
        System.out.println(i);
    }
}
