package com.mycompany.customer;
// Sakha Ibadil Kirom 2507411064 - TI 2A
public class Customer {
    public String name = "Sakha Ibadil Kirom";
    public int custID = 1205;
    public String address;
    public int orderNum;
    public int age;
    
    public void displayCustomer(){
        System.out.println("Customer : " + name);
    }
    public static void main(String[] args) {
        Customer pelanggan1 = new Customer();
        pelanggan1.displayCustomer();
    }
}
