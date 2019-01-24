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
1. void
2. int
3. String
4. double
5. char
6. boolean
7. long

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
**While Loops**
```java
public void alarm () {
    boolean on = checkAlarm();
    while (on) {
        beep();
        on = checkAlarm();
    }
}
```
**For Loops**
```java
public void raiseAlarm(int numOfWarnings){
    for(int i = 1; i <= numOfWarnings; i++){
        System.out.println("Warning # " + i);
    }
}
```
**Break**
```java
/**
*WiFi search
*/
public void searchWifi(){
    for(int i = 1; i <= 10; i++){
        boolean wifiAvailable = ckeckWifi();
        if (wifiAvailable){
            System.out.println("Wifi found");
            break;
        }
    }
}
```
```java
public int martingale() {
    int money = 1000;
    int target = 1200;
    int bet = 10;
    while (money > bet) {
        boolean win = play();
        if (win) {
            money += bet;
            bet = 10;
        } 
        else {
            money -= bet;
            bet *= 2;
        }
        if (money==target)
            break;
    }
    return money;
}
```
**Arrays**
```java
public double calculateAverage(double [] temperatures){
    int size = temperatures.length;
    double total = 0;
    for(int i = 0; i < size; i++){
        total += temperatures[i];
    }
    double average = total / size;
    return average;
}
```
