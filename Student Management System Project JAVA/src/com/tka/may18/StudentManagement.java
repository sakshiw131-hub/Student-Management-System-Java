package com.tka.may18;
    

    import java.util.ArrayList;
	import java.util.Scanner;

	class StudentManagement {

	    ArrayList<Student> students = new ArrayList<>();
	    Scanner sc = new Scanner(System.in);

	    // Add Student
	  public void addStudent1() {

	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Student Age: ");
	        int age = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Course Name: ");
	        String course = sc.nextLine();

	        Student s = new Student(id, name, age, course);

	        students.add(s);

	        System.out.println("\nStudent Added Successfully!");
	    }

	    // View All Students
	   public void viewStudents() {

	        if (students.isEmpty()) {

	            System.out.println("\nNo Student Records Found!");
	            return;
	        }

	        for (Student s : students) {
	            s.display();
	        }
	    }

	    // Search Student
	public void searchStudent() {

	        System.out.print("Enter Student ID to Search: ");
	        int id = sc.nextInt();

	        for (Student s : students) {

	            if (s.id == id) {

	                System.out.println("\nStudent Found!");
	                s.display();
	                return;
	            }
	        }

	        System.out.println("\nStudent Not Found!");
	    }

	    // Update Student
	   public void updateStudent() {

	        System.out.print("Enter Student ID to Update: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        for (Student s : students) {

	            if (s.id == id) {

	                System.out.print("Enter New Name: ");
	                s.name = sc.nextLine();

	                System.out.print("Enter New Age: ");
	                s.age = sc.nextInt();
	                sc.nextLine();

	                System.out.print("Enter New Course: ");
	                s.course = sc.nextLine();

	                System.out.println("\nStudent Updated Successfully!");
	                return;
	            }
	        }

	        System.out.println("\nStudent Not Found!");
	    }

	    // Delete Student
	   public void deleteStudent() {

	        System.out.print("Enter Student ID to Delete: ");
	        int id = sc.nextInt();

	        for (Student s : students) {

	            if (s.id == id) {

	                students.remove(s);

	                System.out.println("\nStudent Deleted Successfully!");
	                return;
	            }
	        }

	        System.out.println("\nStudent Not Found!");
	    }


	}

