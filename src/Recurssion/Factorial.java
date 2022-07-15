package Recurssion;

public class Factorial {
    public static void main(String[] args) {

        //Factorial of 5 means 5*4*3*2*1 =120

        int fact=factorial(5);
        System.out.println(fact);
    }

    private static int factorial(int i) {

        if(i==0){
            return 1;
        }

       return i * factorial(i-1);



    }
}
