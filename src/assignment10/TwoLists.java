package assignment10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TwoLists {
    public  static Map<String,Integer> twoLists(List<String> lists, List<Integer> number){

        if(lists.size()!= number.size())
            throw new IllegalArgumentException();

        Map <String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < lists.size(); i++) {
            map.put(lists.get(i),number.get(i));
        }
        return map;
    }
    public static void main(String[] args) {

        List< String> name = new ArrayList<>();
        List< Integer> num = new ArrayList<>();

        name.add("Dean");
        name.add("Dave");
        name.add("Zaineh");

        num.add(90);
        num.add(80);
        num.add(94);

        System.out.println(twoLists(name,num));
    }
}
