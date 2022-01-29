package assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Count {
    public  static int countDistinct(List<String> list){
        int count = 0;
        Set<String> s = new TreeSet<>();
        s.addAll(list);
         count = s.size();
        return  count;
    }

    public static void main(String[] args) {

        List< String> lists = new ArrayList<>();
        lists.add("Dean");
        lists.add("Dave");
        lists.add("Zaineh");
        lists.add("Yasmeen");
        lists.add("Dean");

        System.out.println(countDistinct(lists));
    }
}
