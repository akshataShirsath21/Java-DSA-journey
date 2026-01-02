public class Swapping_sample {
    public static void main(String[] args) {


//        SWAPPING NUMBER PROBLEM

        int a = 21;       //a is asigned by 21 num
        int b = 57;       //b is asigned by 57 num

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }
}
