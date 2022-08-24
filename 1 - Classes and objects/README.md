# Chapter 1 | Classes and objects
<h2> Object Oriented programming has 2 building blocks, termed as classes and objects,
We use objects, which is an instance of a class, while a class is used which is a blueprint of an object.
</h2> <b> Confused, right!? Please follow along, so you may get a better understanding of classes and objects. </b>

<br />
<br />
<p> We can understand classes and objects by a real world example:</p>
<p>Think of class as any company, for instance it is "GMC", now our class "GMC" has several different objects, these are: </p>
<ul>
<li>Envoy</li>
<li>Sierra</li>
<li>Yukon</li>
</ul>
<center>
<div style="display:flex;">
<img height="150" id="envoy" src="https://user-images.githubusercontent.com/29815204/186344226-d75682bc-bca7-420b-9f7b-856e1b568b1b.jpg"/>
<img height="150" id="yukon" src="https://user-images.githubusercontent.com/29815204/186344255-338bf63b-90a8-4c90-b95e-755dbf530ef2.jpg"/>
<img height="150" id="sierra" src="https://user-images.githubusercontent.com/29815204/186344240-168d2eb1-7df5-415f-9f58-c15e1ce1a92a.jpg"/>
</div>
</center>
<b>These objects can share the same properties and methods:</b>
<ul>
   <li>
    model (which is a integer)
  </li>
  <li>
    color (which is a string)
  </li>
  <li>
    isXL (which is a boolean)
  </li>
  <li>
    price (which is an integer)
  </li>
   <li>
    drive (which is a function/method)
  </li>
   <li>
    break (which is a function/method)
  </li>
  </ul>
 They share these properties, because they came out from the same class! I hope you have got a theoritical understanding of what classes and objects are.
 Lets move to the practical knowledge,
 
 ### declaring a class
 We can create a class using the following syntex
 
 ```java
 public class Gmc {
 int model;
 int price;
 bool isXL;
 string color;
 void drive(){
 system.out.print("Car is being driven")
 }
 void break(){
 system.out.print("break!")
 }
 }
 ```
 if you are in doubt about that public keyword, this is something you will learn in the object modefier topic, while for declaring a class, we use class keyword and then give it any name, in our case we gave it gmc, we close with the class the curly braces, and inside these curly braces, we declare the properties and methods of a class.
 
### creating objects
```java
Gmc envoy = new Gmc();
```
### initializing objects
```
envoy.model = 2009;
envoy.price = 35500;
envoy.isXL = true;
envoy.color = "golden";
```
### using
```java
system.out.println(envoy.model); // print 2009 on console
system.out.println("SAR: " + envoy.price); // print SAR: 35500
envoy.drive(); // print Car is being driven
```
# Exercise:
create a java oops program, which ask user (employee) his name, father name, university from which he is graduated, his age, his field, and then print them on the screen, after that, it asks user to update the info, if user enters "yes", it prompts user with the same questions again but if the user entered "no", it will print thanks.

##### Procedural programming code used in this exercise
1 - using of a scanner to get input

```java
import java.utils.Scanner;
```
```java
Scanner input = new Scanner(System.in);
```
```java
string myVariable = input.nextLine(); //for string
int myVariable = input.nextInt(); // for int
```
2 - functions are also used in this exercise
```java
void myFunction(){
//code
}
```
3 - Printing on console

```java
System.out.print("Hello World!");
System.out.print(1+2);
```
```java
System.out.println("Hello World!");
System.out.println(1+2);
```
4 - if else
```java
if(/*condition*/){
//code 
}
else {
//code 
}
```
