package assignment3;

public class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }


    public double getSalesAmount() {
        return salesAmount;
    }
    @Override
    public String toString() {
        return
                "employee Name: " + employeeName + " " +
                        " product Name: " + productName + " " +
                        " sales Amount: " + salesAmount +"\n";
    }
}
