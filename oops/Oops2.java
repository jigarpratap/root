package oops;

import java.util.Scanner;

 public class Oops2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        String email=scan.nextLine();
        String type=scan.nextLine();
        String location=scan.nextLine();
        Customer c=new Customer(name, email, type, location);
        System.out.println("Customer Name: "+c.getCustomerName());
        System.out.println("Customer Email: "+c.getCustomerEmail());
        System.out.println("Customer Type: "+c.getCustomerType());
        System.out.println("Customer location: "+c.getCustomerLocation());
        scan.close();
    }
}
