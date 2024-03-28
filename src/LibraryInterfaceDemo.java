/*
Instructor: Raheem Abolfathzadeh
Assignment Name:PA 303.10.3 - Practice Assignment - Polymorphism and Interface
Author: Pavlenko Anna
Date: 3/27/2024
 */


public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("// Test case #1: ");
        KidUsers kid1 = new KidUsers();
        KidUsers kid2 = new KidUsers();


        System.out.println();
        System.out.println("Customer #1: ");
        kid1.setAge(10);
        kid1.setBookType("Kids");
        kid1.registerAccount();
        kid1.requestBook();

        System.out.println();
        System.out.println("Customer #2: ");
        kid2.setAge(18);
        kid2.setBookType("Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        System.out.println();

        System.out.println("// Test case #2: ");
        AdultUser adult1 = new AdultUser();
        AdultUser adult2 = new AdultUser();

        System.out.println();
        System.out.println("Customer #3: ");

        adult1.setAge(5);
        adult1.setBookType("Kids");
        adult1.registerAccount();
        adult1.requestBook();

        System.out.println();
        System.out.println("Customer #4: ");

        adult2.setAge(23);
        adult2.setBookType("Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}