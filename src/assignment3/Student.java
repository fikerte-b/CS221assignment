package assignment3;

public class Student {
    private int id;
    private String name;
    private int mark;
    //--------------------------------------------------------------
    public Student(int id, String name, int mark) // constructor to initialize the values
    {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    //--------------------------------------------------------------
    public void displayStudent() {
        System.out.println("Student Id: "+ id +
                ", Student Name: " + name+", Mark: "+mark);
    }

    //--------------------------------------------------------------
    public int getId() // get the Id
    {
        return this.id;
    }
    public int getMark(){
        return this.mark;
    }
    // end class Student

}
