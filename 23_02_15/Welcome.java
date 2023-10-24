/*
    javac data.java -> compiler data.java
    javac *.java -> compiler all java
    java data(.class) -> interpreter
 */

// public_class_name must same as data_name 
// class, object -> UpperCamelCase
public class Welcome {
    public static void main(String[] arges){
        //print saperate to line
        System.out.println("Welcome to Java program!"); 
        happyDay();
        // print don't separate anything
        System.out.print("WelcomeTo");
        System.out.print("Java");
        System.out.print("PG");
    }
    //variable, method -> lowerCamelCase
    public static void happyDay(){
        String notToday = "not today";
        /*
            System.out -> object
            System.out.println -> method
        */
        System.out.println("Happy day is " + notToday + ".");
    }
}
//if you want to build the case whose name don't same as data, please not to public
class Welcome2{
    public static void main(String[] arges){
        System.out.println("Welcome to Java program2!");
    }
} 