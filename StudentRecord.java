import java.util.Scanner;
class Student {
// Static members
static String collegeName;
static int studentCount = 0;
// Final variable
final int MAX_MARK = 100;
// Instance variables
int rollNo;
String name;
// Constructor
Student(int rollNo, String name) {
this.rollNo = rollNo;
this.name = name;
studentCount++;
}
// Inner class for examination details
class ExamResult {
int mark1, mark2, mark3;
// Constructor of inner class
ExamResult(int mark1, int mark2, int mark3) {
this.mark1 = mark1;
this.mark2 = mark2;
this.mark3 = mark3;
}
void displayResult() {
int total = mark1 + mark2 + mark3;
double average = total / 3.0;

System.out.println("\n----- Examination Result -----");
System.out.println("Roll Number : " + rollNo);
System.out.println("Name : " + name);
System.out.println("Mark 1 : " + mark1);
System.out.println("Mark 2 : " + mark2);
System.out.println("Mark 3 : " + mark3);
System.out.println("Total : " + total);
System.out.println("Average : " + average);

if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40)
System.out.println("Result : PASS");
else
System.out.println("Result : FAIL");
}
}
// Static method
static void displayStudentCount() {
System.out.println("\nTotal Students: " + studentCount);
}
}
public class StudentRecord {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Taking common information
System.out.print("Enter college name: ");
Student.collegeName = sc.nextLine();
System.out.print("Enter number of students: ");
int n = sc.nextInt();
Student[] students = new Student[n];
// Input student details
for (int i = 0; i < n; i++) {
System.out.println("\nEnter details of Student " + (i + 1));
System.out.print("Enter roll number: ");
int rollNo = sc.nextInt();
sc.nextLine();
System.out.print("Enter student name: ");
String name = sc.nextLine();
System.out.print("Enter mark in Subject 1: ");
int mark1 = sc.nextInt();
System.out.print("Enter mark in Subject 2: ");
int mark2 = sc.nextInt();
System.out.print("Enter mark in Subject 3: ");
int mark3 = sc.nextInt();
// Create Student object
students[i] = new Student(rollNo, name);
// Create inner class object
Student.ExamResult result = students[i].new ExamResult(mark1, mark2, mark3);
// Display result
System.out.println("\nCollege: " + Student.collegeName);
result.displayResult();
}
// Display total number of students
Student.displayStudentCount();
sc.close();
}
}
