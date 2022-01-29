package assignment10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseMain {

    public static void main(String[] args) {

        List<Course> list = new ArrayList<>();
        Course course1 = new Course("CS221","DS",4);
        Course course2 = new Course("CS105","PS",4);
        Course course3 = new Course("CS101","ST",2);

        list.add(course1);
        list.add(course2);
        list.add(course3);

        System.out.println(courseMap(list));
    }
    public  static Map<String, Course> courseMap(List<Course> course){
        Map <String, Course> map = new HashMap<>();
        for (int i = 0; i < course.size(); i++) {
            map.put(course.get(i).getcID(),course.get(i));
        }
        return map;
    }

}
