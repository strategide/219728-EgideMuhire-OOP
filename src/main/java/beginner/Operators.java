package beginner;

import java.util.Scanner;

/**
 * Working with Java Operators.
 *
 * @author strategide
 */
public class Operators {

    // Static variable declarations
    private static int num1;
    private static int num2;

    public static void main(String[] args) {
        // Java allows the programmer to use many different types of operators
        // Examples are shown below.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers to use in different operations: ");

        // Prompt for the first value and read it in.
        System.out.print("Enter the first number for use: ");
        num1 = input.nextInt();

        // Prompt for the second value and read it in.
        System.out.print("Enter the second number for use: ");
        num2 = input.nextInt();

        // Arithmetic operators
        System.out.println("...Arithmetic Operators...");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));    // Addition
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));    // Subtraction
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));    // Multiplication 
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));    // Division
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));    // Modulus division

        System.out.println();   // empty line

        // Compound assignment operators (assignment operator with operator)
        System.out.println("...Compound Assignment Operators...");
        System.out.println(num1 + " += " + num2 + " = " + (num1 += num2)); // Compound addition
        System.out.println(num1 + " -= " + num2 + " = " + (num1 -= num2)); // Compound subtraction
        System.out.println(num1 + " *= " + num2 + " = " + (num1 *= num2)); // Compound multiplication
        System.out.println(num1 + " /= " + num2 + " = " + (num1 /= num2)); // Compound division
        System.out.println(num1 + " %= " + num2 + " = " + (num1 %= num2)); // Compound modulus

        System.out.println();

        // Unary operators
        System.out.println("...Unary Operators...");
        System.out.println("-" + num2 + " = " + (-num2)); // Negation operator

        System.out.println("++" + num1 + " = " + (++num1)); // Prefix increment
        System.out.println(num1 + "++ = " + (num1++));      // Postfix increment

        System.out.println("++" + num1 + " = " + (++num1)); // Prefix decrement
        System.out.println(num1 + "++ = " + (num1++));      // Postfix decrement

        System.out.println("!true = " + !true);     // boolean negation (!true is false)
        System.out.println("!false = " + !false);   // boolean negation (!false is true)
        System.out.println();

        // Relational / comparison operators
        System.out.println("...Relational / Comparison Operators...");
        System.out.println(num1 + " == " + num2 + " = " + (num1 == num2));  // equal to
        System.out.println(num1 + " != " + num2 + " = " + (num1 != num2));  // not equal to
        System.out.println(num1 + " < " + num2 + " = " + (num1 < num2));    // less than
        System.out.println(num1 + " > " + num2 + " = " + (num1 > num2));    // greater than
        System.out.println(num1 + " <= " + num2 + " = " + (num1 <= num2));  // less than or equal to
        System.out.println(num1 + " >= " + num2 + " = " + (num1 >= num2));  // greater than or equal to

        System.out.println();

        // Reset the values
        num1 = 2;
        num2 = 1;
        // Conditional or Logical operators
        // Logical AND
        System.out.println("...Conditional / Logical Operators...");
        System.out.println(true + " && " + true + " = " + (true && true));  // true && true = true
        System.out.println((num1 > num2) + " && " + (num1 > num2) + " = " + ((num1 > num2) && (num1 > num2)));  // true && true = true
        System.out.println(false + " && " + true + " = " + (false && true));  // false && true = false
        System.out.println((num1 == num2) + " && " + (num1 > num2) + " = " + ((num1 == num2) && (num1 > num2)));  // false && true = false
        System.out.println(false + " && " + false + " = " + (false && false));  // false && false = false
        System.out.println((num1 == num2) + " && " + (num1 == num2) + " = " + ((num1 == num2) && (num1 == num2)));  // false && false = false

        System.out.println();
        
        // Logical OR
        System.out.println(true + " || " + true + " = " + (true || true));  // true || true = true
        System.out.println((num1 > num2) + " || " + (num1 > num2) + " = " + ((num1 > num2) || (num1 > num2)));  // true || true = true
        System.out.println(false + " || " + true + " = " + (false || true));  // false || true = true
        System.out.println((num1 == num2) + " || " + (num1 > num2) + " = " + ((num1 == num2) || (num1 > num2)));  // false || true = true
        System.out.println(false + " || " + false + " = " + (false || false));  // false || false = false
        System.out.println((num1 == num2) + " || " + (num1 == num2) + " = " + ((num1 == num2) || (num1 == num2)));  // false || false = false

        System.out.println("!true = " + (!true));   // !true = false
        System.out.println("!" + ((num1 > num2)) + " = " + !(num1 > num2));
        System.out.println("!false = " + (!false));   // !false = true
        System.out.println("!" + ((num1 == num2)) + " = " + !(num1 == num2));
        
        System.out.println();
        
        // Type checking with the 'instanceof' operator
        // Check if 'input' object is an instance of the 'Scanner' class
        System.out.println("input instanceof Scanner = " + (input instanceof Scanner)); // true - 'input' is an instance of the 'Scanner'
        System.out.println();
        
        Child child = new Child();
        Parent parent = new Parent();
        GrandParent grandParent = new GrandParent();
        
        // TRUE - 'child' is an instance of 'Child'
        System.out.println("child instanceof Child = " + (child instanceof Child));         
        // TRUE - 'child' is also an instance of 'Parent' (because the 'Child' class directly inherits everything from 'Parent')
        System.out.println("child instanceof Parent = " + (child instanceof Parent));
        // TRUE - 'child' is an instance of 'GrandParent'(because the 'Child' class indirectly inherits from 'GrandParent' through 'Parent' class)
        System.out.println("child instanceof GrandParent = " + (child instanceof GrandParent)); 
        System.out.println();
        
        // TRUE - 'parent' is an instance of 'Parent'
        System.out.println("parent instanceof Parent = " + (parent instanceof Parent));
        // TRUE - 'parent' is an instance of 'GrandParent' (because the 'Parent' class directly inherits from 'GrandParent')
        System.out.println("parent instanceof GrandParent = " + (parent instanceof GrandParent));
        System.out.println();
        
        // TRUE - 'grandParent' is an instance of 'GrandParent'
        System.out.println("grandParent instanceof GrandParent = " + (grandParent instanceof GrandParent));
        System.out.println();
        
        // FALSE - 'parent' is NOT an instance of 'Child' (because the 'Parent' class does not inherit from the 'Child' class)
        System.out.println("parent instanceof Child = " + (parent instanceof Child));
        // FALSE - 'grandParent' is NOT an instance of 'Parent' (because the 'GrandParent' class does not inherit from the 'Parent' class)
        System.out.println("grandParent instanceof Parent = " + (grandParent instanceof Parent));
        // FALSE - 'grandParent' is NOT an instance of 'Child' (because the 'GrandParent' class does not inherit from the 'Child' class)
        System.out.println("grandParent instanceof Child = " + (grandParent instanceof Child));
        System.out.println();
        
        // TRUE - any instance of any class is also an instance of 'Object' (because every single class in Java indirectly inherits from the 'Object' class).
        System.out.println("child instanceof Object = " + (child instanceof Object));
        System.out.println("parent instanceof Object = " + (parent instanceof Object));
        System.out.println("grandParent instanceof Object = " + (grandParent instanceof Object));
        System.out.println("input instanceof Object = " + (input instanceof Object));
    }
}
