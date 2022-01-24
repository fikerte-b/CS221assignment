package assignment8;

public class FindChar {

//    public static int find(String str, char c) {
//        String s = str.toUpperCase();
//        char cc = Character.toUpperCase(c);
//        if(s.length() == 0)
//            return 0;
//
//        else if(s.charAt(0) == cc)
//            return 1 + find(str.substring(1),c);
//        else
//            return find(str.substring(1), c);
//    }

    public static boolean doesContains(String str, char c){
        String s = str.toUpperCase();
        char cc = Character.toUpperCase(c);
        if(s.length() == 0)
            return false;

        else if(s.charAt(0) == cc)
            return true;
        else
            return doesContains(str.substring(1), c);

    }

    public static void main(String[] args) {
//        System.out.println("The total occurrence of the character is: " + find("DataStructure", 'd'));
//        System.out.println("The total occurrence of the character is: " +find("ILoveJava",'A'));
        System.out.println(doesContains("DataStructure", 'd'));
        System.out.println(doesContains("ILoveJava",'A'));
        System.out.println(doesContains("ILoveJava",'x'));


    }
}
