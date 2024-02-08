package oops;

import java.util.Scanner;

class Address{
     String street;
     String counrty;
     String city;
     int pincode;
     public void displayAddress()
     {
        System.out.println("Street: "+street);
        System.out.println("city: "+city);
        System.out.println("Pincode: "+pincode);
        System.out.println("Country: "+counrty);
     } 
 }
public class Oops1 {
    public static void main(String[] args) {
        Address a=new Address();
        Scanner scan=new Scanner(System.in);
        String st=scan.nextLine();
        String c=scan.nextLine();
        String ctry=scan.nextLine();
        int pinc=scan.nextInt();
        a.street=st;
        a.city=c;
        a.counrty=ctry;
        a.pincode=pinc;
        a.displayAddress();
       scan.close();
    }
}
