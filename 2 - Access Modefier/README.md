# Chapter 2 | Access Modefiers and Encapsulation
<h2> Access modefiers, which plays a key role to achieve encapsulation in a program, while encapsulation ensures that the pertinent data like user password or verification code is hidden from the user! </b> </h2>

<br />
<br />

<p>In technical sense, Access modefiers decide the accessibility of classes and the members(variables, methods, constructors etc inside of a class are called its members) of the classes, Encapsulation encapsuate the fields and methods inside a single class to prevent editing and accessing fields to be accessed from outside of that class.</p>


 
 ### Access Modefiers
 Public: to make class or its members to be accessed outside of it
 ```java
 public class main{
 //......
 }
 ```
 ```java
 public void myFunc(){
 //......
 }
 ```
 ```java
 public int myInt = 1;
 ```
 Private: to make class or its members forbidden to be accessed outside of the class
 ```java
 private class main{
 //......
 }
 ```
 ```java
 private void myFunc(){
 //......
 }
 ```
 ```java
 private int myInt = 1;
 ```
 
 Protected: to make class or its members to be visible only within the packege or all subclasses
 ```java
 protected class main{
 //......
 }
 ```
 ```java
 protected void myFunc(){
 //......
 }
 ```
 ```java
 protected int myInt = 1;
 ```
  Default: packege private visibility, declarations are visible only within the package
 ```java
 class main{
 //......
 }
 //or
 default class main{
 //......
 }
 ```
 ```java
 void myFunc(){
 //......
 }
 //or
 default void myFunc(){
 //......
 }
 ```
 ```java
 int myInt = 1;
 //or
 default string myString = "abc";
 ```
 
### Examples:
#### private class
```java
class MyClass{
private String myStr = "Sharjeel Baig"
}
class MyClass2{
MyClass xyz = new MyClass();
System.out.println(xyz.myStr); // output error: myStr has private access in MyClass
}
```
```
error: myStr has private access in MyClass
```
#### protected class
```java
class Person {
  protected String fname = "Sharjeel";
  protected String lname = "Baig";
  protected String email = "Example@gmail.com";
  protected int age = 19;
}

class Student extends Person {
  private int graduationYear = 2018;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}
```
if we remove the 
```java
extends Person
```
then you will encounter the folllowing error:
```
Main.java:12: error: cannot find symbol
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
                                       ^
  symbol:   variable fname
  location: variable myObj of type Student
Main.java:12: error: cannot find symbol
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
                                                           ^
  symbol:   variable lname
  location: variable myObj of type Student
Main.java:13: error: cannot find symbol
    System.out.println("Email: " + myObj.email);
                                        ^
  symbol:   variable email
  location: variable myObj of type Student
Main.java:14: error: cannot find symbol
    System.out.println("Age: " + myObj.age);
                                      ^
  symbol:   variable age
  location: variable myObj of type Student
4 errors
```
#### public example
```java
//in a file named MyPublicClass.java
public class MyPublicClass {
  public String fname = "Sharjeel";
  public String lname = "Baig";
  public String email = "Example@gmail.com";
  public int age = 19;
}

```
```java
class Main {
  public static void main(String[] args) {
    Main myObj = new Main(); 
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
```
#### default example
```java
 class Main {

  public static void main(String[] args) {
    AnotherClass myObj1 = new AnotherClass();
    System.out.println(myObj1.x);
  }
}
class AnotherClass {
  int x = 5;
  }
```

# Getters and Setters
Well, if you have set any variable as private, but you want to access it anyways. For example, a password variable is set to private but in order to login your acount, you have to access that variable in order to proceed. In this case, getters and setters plays their role.
#### Getter:
In an Account class we have declared a private password variable which can only be accessible by a getter, so we have also used getter here
```java
public class Account {
   private String password = "$uperSecretPa$$WORLD1#";

   // Getter
   public String getPassword() {
     return password;
   }
}
```
In our main class,
```java
public class Main {
  public static void main(String[] args) {
    Account myObj = new Account();
    System.out.println(myObj.getPassword());
  }
}
```

#### Setter:
In an Account class we have declared a private name variable which can only be changed by a setter, so we have also used setter here
```java
public class Account {
   private String name = "Sharjeel Baig";

   // Setter
   public String setName(String newName) {
     this.name = newName();
   }
}
```
In our main class,
```java
public class Main {
  public static void main(String[] args) {
    Account myObj = new Account();
    myObj.setName("Shazi Baig");  // Shazi is my nickname by the way (XD)
  }
}
```


Now you have entered your password to login to your social media account, the backend process of social media will check your entered password and the original password which is saved in database using a getter, like this:
```java
if(enteredPassword == myObject.getPassword()){
signInUser();
} else {
giveWrongPasswordError();
}
```
And You are about to change your password, you have recieved an otp to confirm it is you, and it is confirmed!, Now to change your password, following code will be used:
```java
if(enteredOTP == realOTP){
myObject.setPassword("my$uper$ecretNewPa$$worLDD1@#");
}
```
I hope you have understood encapsulation in java, for your practice I have prepared an exercise task for you, which is a task to get a circle radius & color and to set a circle radius & color.
# Exercise
create a java program in which a Class is used for a circle, this class contain private color and radius variables and getter/setter for each variables, set color and radius of a circle by a user input and display them on screen.
