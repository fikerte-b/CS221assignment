package assignment8;

public class CountVowels {

    private static int countVowel(String str) {
        String s = str.toUpperCase();
        if (s.length() == 0 ) {
            return 0;
        } else if (s.charAt(0) == 'A' ||
        s.charAt(0) == 'E' ||
        s.charAt(0) == 'I' ||
        s.charAt(0) == 'O'||
        s.charAt(0) == 'U') {
            return 1 + countVowel(str.substring(1));
        } else {
            return countVowel(str.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println("The total number of vowels in the string is: " + countVowel("DataStructure"));
        System.out.println("The total number of vowels in the string is: " + countVowel("ILoveJava"));

    }
}
