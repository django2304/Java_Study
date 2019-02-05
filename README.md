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
## Object Oriented Programming in Java
### The World of Objects
**Creating Main class and method**
```java
public class Main {

    public static void main(String[] args) {
	System.out.println("Hello world!");
    }
}
```
**Constructors**
```java
class Game{
   ...
   // Constructor
   Game(){
      // Initialization code goes here
   }
   ...
}
```
**Parameterized constructors**
```java
class Game{
   int score;
   // Default constructor
   Game(){
      score = 0;
   }
   // Constructor by starting score value
   Game(int startingScore){
      score = startingScore;
   }
}
```
**Accessing a constructor**
```java
Game tetris = new Game();
Game darts = new Game(501);
Game darts = null;
```
**Self Reference**
```java
class Position {
   int row = 0;
   int column = 0;

    //constructor
   Position(int row, int column) {
      this.row = row;
      this.column = column;
   }
}
```
**Fields (public vs private)**
```java
public class Book{
   private String title;
   private String author;
   private boolean isBorrowed;
   public Book(String title, String author){
      this.title = title;
      this.author = author;
   }
   public void borrowBook(){
      isBorrowed = true;
   }
   public void returnBook(){
      isBorrowed = false;
   }
   public boolean isBookBorrowed(){
      return isBorrowed;
   }
}
```
**Methods (public vs private)**
```java
class Person{
   private String userName;
   private String SSN;
   private String getId(){
      return SSN + "-" + userName;
   }
   public String getUserName(){
      return userName;
   }
   public boolean isSamePerson(Person p){
      if(p.getId().equals(this.getId()){
         return true;
      }
      else{
         return false;
      } 
   }
}
```
### User Interection
**Input Scanner**
Line
```java
System.out.println("Enter your address: ");
Scanner scanner = new Scanner(System.in);
String address = scanner.nextLine();
System.out.println("You live at: " + address);
```
Integer
```java
System.out.println("Enter your grade: ");
Scanner scanner = new Scanner(System.in);
int grade = scanner.nextInt();
if(grade > 90){
	System.out.println("Wow! you did well!");
}
else{
	System.out.println("Not bad, but you can do better next time!");
}
```
**File Scanner**
```java
File file = new File("expenses.txt");
Scanner fileScanner = new Scanner(file);
```
**Exceptions**
```java
try{
	openFile("somefile.txt");
	array[index]++;
} catch(FileNotFoundException exception) {
	// Handle all the possible file-not-found-related issues here
} catch(IndexOutOfBoundsException exception) {
	// Handle all the possible index-out-of-bounds-related issues here
} 
```
### Inheritance
**Inheritance**
```java
class BankAccount {
	String account;
	int balance;
}
class CheckingAccount extends BankAccount {
	int limit;
}
class SavingsAccount extends BankAccount {
	int transfers;
}
class COD extends BankAccount {
	Date expiry;
}
```
**Polymorphism and Overriding**
```java
public class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(toString() + "Я танцую как все.");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет. " ;
    }
}

public class ElectricBoogieDancer extends Dancer {
    public ElectricBoogieDancer(String name, int age) {
        super(name, age);
    }
// переопределение метода базового класса
    @Override
    public void dance() {
        System.out.println( toString() + "Я танцую электрик буги!");
    }
}

public class BreakDankDancer extends Dancer{

    public BreakDankDancer(String name, int age) {
        super(name, age);
    }
// переопределение метода базового класса
    @Override
    public void dance(){
        System.out.println(toString() + "Я танцую брейк-данс!");
    }
}

public class Main {

    public static void main(String[] args) {
        Dancer dancer = new Dancer("Антон", 18);

        Dancer breakDanceDancer = new BreakDankDancer("Алексей", 19);// восходящее преобразование к базовому типу
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Игорь", 20); // восходящее преобразование к базовому типу

        List<Dancer> discotheque = Arrays.asList(dancer, breakDanceDancer, electricBoogieDancer);
        for (Dancer d : discotheque) {
            d.dance();// полиморфный вызов метода
        }
    }
}
```
**Interfaces**
```java
public interface Swim {
    void swim();
}

public class Human implements Swim {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(toString()+" Я плаваю с помощью надувного круга.");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет. ";
    }

}

public class Fish implements Swim{
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Я рыба " + name + ". Я плыву, двигая плавниками.");

    }

public class UBoat implements Swim {

    private int speed;

    public UBoat(int speed) {
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println("Подводная лодка плывет, вращая винты, со скоростью " + speed + " узлов.");
    }
}

public class Main {

    public static void main(String[] args) {
        Swim human = new Human("Антон", 6);
        Swim fish = new Fish("кит");
        Swim boat = new UBoat(25);

        List swimmers = Arrays.asList(human, fish, boat);
        for (Swim s : swimmers) {
            s.swim();
        }
    }
}
```
**Comparable Interface**
```java
public class Book implements Comparable<Book>{
   public int compareTo(Book specifiedBook) {
      // First check if they have different page counts
      if(this.numberOfPages != specifiedBook.numberOfPages){
         // this will return a negative value if this < specified but will return a positive value if this > specified
         return this.numberOfPages - specifiedBook.numberOfPages;
      }
      // If page counts are identical then check if the titles are different
      if(!this.title.equals(specifiedBook.title){
         return this.title.compareTo(specifiedBook.title);
      }
      // If page titles are also identical then return the comparison of the authors
      return this.author.compareTo(specifiedBook.author);
    }
}
```
**Final Methods**
```java
public class Room{
   private double width;
   private double height;
   public Room(double width, double height){
      this.width = width;
      this.height =height;
   }
   public final double getArea(){
      return width*height;
   }
}

public class LivingRoom extends Room{
   // The constructor simply calls the parent's constructor using super()
   public LivingRoom(double width, double height){
        super(width,height);
    }
   // Not allowed to override getArea() here
}
```
