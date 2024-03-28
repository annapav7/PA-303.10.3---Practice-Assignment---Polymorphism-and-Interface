/*
Instructor: Raheem Abolfathzadeh
Assignment Name:PA 303.10.3 - Practice Assignment - Polymorphism and Interface
Author: Pavlenko Anna
Date: 3/27/2024
 */


public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("// Test case #1: ");
        KidUsers kidUsers = new KidUsers();

        kidUsers.setAge(10);
        kidUsers.setBookType("Kids");
        kidUsers.registerAccount();
        kidUsers.requestBook();

        kidUsers.setAge(18);
        kidUsers.setBookType("Fiction");
        kidUsers.registerAccount();
        kidUsers.requestBook();

        System.out.println();

        System.out.println("// Test case #2: ");
        AdultUser adultUser = new AdultUser();


        adultUser.setAge(5);
        adultUser.setBookType("Kids");
        adultUser.registerAccount();
        adultUser.requestBook();

        adultUser.setAge(23);
        adultUser.setBookType("Fiction");
        adultUser.registerAccount();
        adultUser.requestBook();


    }
}