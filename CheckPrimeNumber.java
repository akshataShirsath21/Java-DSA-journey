package Java_Practice;

public class CheckPrimeNumber {
   static boolean isPrime(int a){
        if (a <=1){
            return false;
        }
        for (int i =2;i< a;i++){
            if (a%i ==0){
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(isPrime(37));
    }
}
