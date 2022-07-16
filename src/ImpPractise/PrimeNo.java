package ImpPractise;

public class PrimeNo {
    public static void main(String[] args) {
        boolean result=isPrime(10);
        if(result){
            System.out.println(result);
        }else {
            System.out.println(result);
        }

    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}
