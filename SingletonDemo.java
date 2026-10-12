import java.util.Scanner;

class SchoolConfiguration {

private static SchoolConfiguration instance;
private String schoolName;
private String academicYear;

private SchoolConfiguration(String schoolName, String academicYear) {
this.schoolName = schoolName;
this.academicYear = academicYear;
System.out.println("\nSchool Configuration Created");
}

public static SchoolConfiguration getInstance(
String schoolName, String academicYear) {
if (instance == null) {
instance = new SchoolConfiguration(
schoolName, academicYear);
}
return instance;
}

public void displayConfiguration() {
System.out.println("\n--- School Configuration ---");
System.out.println("School Name   : " + schoolName);
System.out.println("Academic Year : " + academicYear);
}
}

public class SingletonDemo {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter School Name: ");
String schoolName = sc.nextLine();

System.out.print("Enter Academic Year: ");
String academicYear = sc.nextLine();

SchoolConfiguration config1 = SchoolConfiguration.getInstance(schoolName, academicYear);
config1.displayConfiguration();

System.out.println();

SchoolConfiguration config2 = SchoolConfiguration.getInstance("Another School", "2027-2028");
config2.displayConfiguration();

if (config1 == config2) {
System.out.println(
"\nBoth references point to the same object.");
}

sc.close();
}
}
