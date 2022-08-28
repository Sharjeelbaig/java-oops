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
 
### Example
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
