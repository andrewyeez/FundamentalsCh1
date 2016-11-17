/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1;

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
        String Q5 = "Create a jagged/ragged 2D integer array and populate them."
                + "Create a new array that will have the reverse the order "
                + "of the initial jagged/ragged array.";
        String Q6 = "Explain the difference between pass by value and pass by "
                + "reference. Which one does "
                + "public static void main(String[] args) use ? ";
        String Q7 = "Give examples of overloading a method. What are the "
                + "benefits of overloading methods ? ";
        String Q8 = "When do we use a void method ?"
                + "What does a void static method do ?";
        String Q9 = "Explain what recursion is and give an example of when to "
                + "use recursion.";
        System.out.println(Q1);
        
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
        
    }
    
}
