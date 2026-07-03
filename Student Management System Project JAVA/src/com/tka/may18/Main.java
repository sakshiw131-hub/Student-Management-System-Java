package com.tka.may18; 

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManagement sm = new StudentManagement();

        while (true) {

            System.out.println("\n=================================");
            System.out.println(" STUDENT MANAGEMENT SYSTEM ");
            System.out.println("=================================");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("\nEnter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sm.addStudent1();
                    break;

                case 2:
                    sm.viewStudents();
                    break;

                case 3:
                    sm.searchStudent();
                    break;

                case 4:
                    sm.updateStudent();
                    break;

                case 5:
                    sm.searchStudent();
                    break;

                case 6:
                    System.out.println("\nThank You!");
                    System.exit(0);

                default:
                    System.out.println("\nInvalid Choice!");
            }
        }
    }
}
