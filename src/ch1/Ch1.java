/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

import java.util.Random;

/**
 *
 * @author andrewyee
 */
public class Ch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        String Q1 = "What is data abstraction? "
                + "Give a few examples of data abstraction. "
                + "How does it support OOP ?";
        String Q2 = "Give examples of type coversion and casting. "
                + "(Reminder that we should never be ambigous with our "
                + "codes, use casting sparingly)";
        String Q3 = "Explain the difference between i++/i-- and ++i/--i.";
        String Q4 = "Give three variations of declaring and assigning an "
                + "integer variable and adding 3 (int).";
        String Q5 = "Create a jagged/ragged 2D integer array and populate them.";
        String Q6 = "Explain the difference between pass by value and pass by "
                + "reference. Which one does "
                + "public static void main(String[] args) use ? ";
        String Q7 = "Give examples of overloading a method. What are the "
                + "benefits of overloading methods ? ";
        String Q8 = "When do we use a void method ?"
                + "What does a void static method do ?";
        String Q9 = "Explain what recursion is and give an example of when to "
                + "use recursion.";
        
        String A1 = "Data abstraction is used to make something hidden from the"
                + " parent. For example, an abstract class does not need to have"
                + " an abstract method but it does need to be inherited to be used."
                + " The abstract class cannot be instantiated and therefore must"
                + " first be inherited by another class to be able to gain"
                + " access to the abstract class fields and methods. Abstraction"
                + " requires the use of inheritance and inheritance is a property"
                + " of OOP. ";
        
        String A2 = "Type casting is changing the type of a variable into "
                + " another type assigned to a new variable. For example. "
                + " int x = 1; long y = x. Type casting/conversion mean the same"
                + " thing. There are two types of casting a data and thats explicit"
                + " and implicit. "
                + " Implicit: int x = 1; long y = x;"
                + " Explicit: long y = 1; int x = (int) y";
        
        // A3
        // As we see from the examples the variables that have 
        // --/++ BEFORE the variable will be evaluated WITH the subtract 1 or add 1.
        //       The subtract 1 or add 1 will be executed before it runs the variable x.
        // --/++ AFTER the variable will be evaluated WITHOUT the subtract 1 or add 1.
        //       The subtract 1 or add 1 will be executed after it runs the variable y.
//        int x = 10;
//        int y = 0;
//        
//        int minusX = --x;
//        int plusX = ++x;
//        int Yminus = y--;
//        int Yplus = y++;
//        
//        System.out.println("  x: " + x);
//        System.out.println("--x: " + minusX);
//        System.out.println("++x: " + plusX);
//        System.out.println("  y: " + y);
//        System.out.println("y--: " + Yminus);
//        System.out.println("y++: " + Yplus);
//        
//        String line = "-------------------------------------------------------";
//        System.out.println(line);
        // A4
//        int e = 0;
//        int ee = e + 1;
//        int ex = (e += 1);
//        int ey = e++;
//        
//        System.out.println("     e: " + e);
//        System.out.println(" e + 1: " + ee);
//        System.out.println("e += 1: " + ex);
//        System.out.println("   e++: " + ey);
        // A5
//        Random rand = new Random();
//        int row = 3; // 3 rows and ?? columns
//        int arr[][] = new int[row][];
//        for(int i = 0; i < arr.length; i++){
//            // new col value
//            int col = rand.nextInt(5) + 1;
//            arr[i] = new int[col];
//            for(int y = 0; y < arr[i].length; y++){
//                arr[i][y] = rand.nextInt(10) + 1;;
//            }
//        }
//        
//        // lets now output our 2 dimensional jagged array
//        for(int i = 0; i < arr.length; i++){
//            System.out.println("____Row #" + i + "___");
//            for(int y = 0; y < arr[i].length; y++){
//                System.out.println("arr["+i+"]["+y+"]: " + arr[i][y]);
//            }
//        }
        // A6
        // By default Java is always pass by value including the parameters
        // used in public static main! Pass by reference vs pass by value.
        // reference means you are handling the address/location of the actual
        // value while pass by value means you are given an exact copy of the
        // actual value.
        // A8
        // We use void methods when we dont want to return anything with our 
        // method. A void static method by definition is just a method that
        // can be instantiated without creating an instance of the class and
        // does not return anything.
        // A7
        // Overloading is when you have the same method name but have different
        // type/values in the parameters.
//        Ch1 c = new Ch1();
//        c.over_load("Andrew");
//        c.over_load(1);

        // A9
        // Recursion is when a method return value is itself and it does this over
        // and over, until a certain condition is met in the method that would
        // remove itself from the recursive loop, Therefore, giving you the 
        // desired outcome.
//        Ch1 c = new Ch1();
//        int num = c.recurse(10);
//        System.out.println("This should be 2 = " + num);
        
    }
    
    // A7
//    public void over_load(int x){
//        System.out.println("Type INT: " + x);
//    }
//    public void over_load(String x){
//        System.out.println("Type STRING: " + x);
//    }
    // A9
//    public int recurse(int x){
//        if(x > 2){
//            x--;
//        }else if(x < 2){
//            x++;
//        }
//        if(x != 2){
//            System.out.println("recursing because 2 != " + x);
//            return recurse(x);
//        }
//        return x;
//    }
}
