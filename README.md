# Java_Study
## Intro To Java
### Variables and Data Types
**Hello World!**
```java
System.out.println("Java Rocks!");
```
**Variables**
```java
int passengers; //integers
long passengers; //long integers
double passengers; //double
String driver; //string
char answer; //character
boolean fact; //boolean
```
**Casting**
```java
int x = 5;
int y = 2;
double div = 5/2;
System.out.println(div); //2
double accurate = (double)x/y;
System.out.println(accurate); //2.5
```
### Control Flow and Conditionals
**if-else statement**
```java
int ticketPrice = 10;
int age;
boolean isStudent;
if (age <= 15) {
    ticketPrice=5;
}
else if (age > 60) {
    ticketPrice=5;
}
else if (isStudent) {
    ticketPrice=5;
}
```
**Logical Operators**
AND &&
OR ||
NOT !

**Operations Order**
1. Parentheses
2. NOT !
3. AND &&
4. OR ||

**Switch Statement**
```java
int passcode;
String coffeeType;
switch(passcode) {
case 555: coffeeType = "Espresso";
break;
case 312: coffeeType = "Vanilla late";
break;
case 629: coffeeType = "Drip coffee";
break;
default: coffeeType = "Unknown";
break;
}
System.out.println(coffeeType);
```
