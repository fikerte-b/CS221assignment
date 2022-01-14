package assignment3;

public class MainStudentArray {

    public static void main(String[] args)
    {
        // Create an object for StudentArray and invoke all the methods

        StudentArray students = new StudentArray(4);
        students.insert(11,"Sofiya",87);
        students.insert(12,"Dessalegn",95);
        students.insert(14,"Embeye",73);
        students.insert(13,"Rahel",99);

        students.displayAll();
        students.delete(13);
        Student s = students.find(12);
        s.displayStudent();


        // Find the student who got Maximum and Minimum Mark

        students.maxMin();




    } // end main()
} // end class Studentarray

