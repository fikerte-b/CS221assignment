package assignment7;

public class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer " + name ;

    }
}
