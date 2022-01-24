package assignment8;

public class DecimalToBinary {
    public static String binary(int num) {

        if (num == 0) {
            return "0";
        }
        if (num == 1) {
            return "1";
        } else

            return binary(num / 2) + num % 2;

    }



    public static void main(String[] args) {

        System.out.println(binary(32));
        System.out.println(binary(10));


    }
}
