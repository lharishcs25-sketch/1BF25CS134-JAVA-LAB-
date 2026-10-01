
import java.util.Scanner;

class Student {
    String usn;
    String name;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }
 void display() {
        System.out.println("USN: " + usn + " | Name: " + name);
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student(); 
            students[i].accept();        
        }
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].display();  
        }
    }
}
