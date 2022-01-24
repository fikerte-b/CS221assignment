package assignment8;

public class FindChar {

    public static int find(String s, char c) {
        String st = s.toUpperCase();
        if(st.length() == 0)
            return 0;
        else if(st.charAt(0) == c)
            return 1 + find(st.substring(1),c);
        else
            return find(st.substring(1), c);
    }


    public static void main(String[] args) {
        System.out.println(find("DataStructure", 'd'));
        System.out.println(find("ILoveJava",'a'));

    }
}
