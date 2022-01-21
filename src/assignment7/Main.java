package assignment7;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        CustomerQueue<Customer> lines = new CustomerQueue();

        Customer c1 = new Customer("Sofiya");
        Customer c2 = new Customer("Dessalegn");
        Customer c3 = new Customer("Embeye");
        Customer c4 = new Customer("Rahel");
        Customer c5 = new Customer("Akia");

        lines.offer(c1);
        lines.offer(c2);
        lines.offer(c3);
        lines.offer(c4);
        lines.offer(c5);

        System.out.println("Customers in line: " + lines);

        // Assume average teller processing time is 15mins===> 1.5seconds for the code
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {

                System.out.println("Teller Calling, next " + lines.poll());
                if (lines.getSize() == 0) {
                    timer.cancel();
                }

            }

        };timer.schedule(task,0,1500);
    }
}
