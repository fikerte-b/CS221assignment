package assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NoDuplicateReturn{

    public static Set<String> noDuplicate(List<String> list){
        Set<String> s = new TreeSet<>();
            s.addAll(list);
             return s;


    }
    public static void main(String[] args) {
        List< String> lists = new ArrayList<>();
        lists.add("Dean");
        lists.add("Dave");
        lists.add("Zaineh");
        lists.add("Yasmeen");
        lists.add("Dean");

        System.out.println(noDuplicate(lists));

    }
}
