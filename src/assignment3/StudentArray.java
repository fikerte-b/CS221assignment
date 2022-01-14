package assignment3;

public class StudentArray {
    private Student[] a; // reference to array
    private int nElems; // number of data items

    public StudentArray(int max) // constructor max is a capacity/length
    {
        a = new Student[max];
        nElems = 0;
    }
    //--------------------------------------------------------------
    public Student find(int id)
    {
        for(int i =0; i< nElems; i++) {
            if (a[i] != null && a[i].getId() == id)
                return a[i];
        }
        return null;
    }
    // end find()
    //-------------------------------------------------------------- // put student into array at last
    public void insert(int id, String name, int mark){
    // Duplicates of id not allowed. Make a check before inserting values
        for(int i=0; i<a.length; i++){
            if(a[i]!= null && a[i].getId() == id)
                throw new IllegalArgumentException("Duplication is not allowed");
            if(a[i]==null){
                a[i] = new Student(id, name, mark);
                nElems++;
                break;
            }

        }
    }
    //--------------------------------------------------------------
    public boolean delete(int id) { // delete student from array
        int index = 0;
        int i;
        for(i =0; i<a.length; i++){
            if(a[i]!= null && a[i].getId()==id){
                index =i;
                break;
            }
        }
        if(i== a.length)
            return false;
        for(int j = index+1; j< a.length; j++)
            a[j-1] = a[j];
        nElems--;
        return true;
    }
    //--------------------------------------------------------------
    public void displayAll() {// displays array contents
        for(int i =0; i<nElems; i++){
            if(a[i]!= null)
                System.out.println(a[i].getId());
        }
    }

    public void maxMin(){
        int max = a[0].getMark();
        int min = a[0].getMark();
        for(int i=1;i<nElems;i++){
            if(max > a[i].getMark())
             min = a[i].getMark();
            else
                max = a[i].getMark();
        }

        System.out.println("Maximum Mark: "+ max);
        System.out.println(("Minimum Mark: "+ min));
    }
}
