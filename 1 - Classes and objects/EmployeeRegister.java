import java.util.Scanner;

class EmployeeRegister {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    Employee employee = new Employee();
    System.out.println("Please enter your profile information");
    employee.getInfo();
    employee.displayInformation();
    System.out.println("Do you want to update your profile information?");
    String answer = input.next();
    if (answer.equals("yes")) {
      System.out.println("Enter your new information");
     employee.getInfo();
    } else {
      System.out.println("Thank you");
    }
  }
}

class Employee {
  Scanner input = new Scanner(System.in);
  String name,
      university,
      field,
      fathername;
  int age;

  void getInfo() {
    System.out.print("Enter Your Name:");
    name = input.nextLine();

    System.out.print("Enter Your Father Name:");
    fathername = input.nextLine();

    System.out.print("\nEnter Your Age:");
    age = input.nextInt();

    System.out.print("\nEnter Your University Name:");
    university = input.next();

    System.out.print("\nEnter Your field Name in University:");
    field = input.next();
  }

  void displayInformation() {
    System.out.println(" ***** Display Information ******");
    System.out.println("Name: " + name);
    System.out.println("Father Name: " + fathername);
    System.out.println("Age: " + age);
    System.out.println("University: " + university);
    System.out.println("field: " + field);
  }

}