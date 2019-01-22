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
### Functions
**Function Definition**
```java
public void chorus () {
    System.out.println("We're flying high");
    System.out.println("We're watching the world pass us by");
    System.out.println("Never want to come down");
    System.out.println("Never want to put my feet back down on the ground");
}
```
**Function Parameters**
```java
public void greetings (String location, double time) {
    System.out.printlin ("Hello, " + location + ". It’s " + time + " o’ clock");
}
```
**Return Value**
void
int
String
double
char
boolean
long

**Random Numbers**
```java
// random num between 0 and (almost) 1
double randomNumber = Math.random();
// change range to 0 to (almost) 10
double randomNumber = Math.random() * 10;
// cast to integer (ignore decimal part)
// ex. 9.985 becomes 9
double randomInt = (int) randomNumber;
```
### Loops
