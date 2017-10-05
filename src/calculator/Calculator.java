/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Saleron
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String operation, again;
        double a, b, result = 0;
        boolean yesNo = true;
        
        Scanner input = new Scanner (System.in); 
        
        while (yesNo)
        {
            System.out.println("What would you like to do? +, -, *, /");
        
            operation = input.nextLine();
            
            if  (!"+".equals(operation) && !"-".equals(operation) && !"*".equals(operation) && !"/".equals(operation))
                {
                    System.out.println("Wrong key!");
                    continue;
                }
            else
                {
                    
                    System.out.println("Enter the first number: ");
                    while (!input.hasNextDouble())
                    {
                        System.out.println("This is not a number! Please enter a number.");
                        input.next();
                    }
                    a = input.nextDouble();
                    
                    System.out.println("Enter the second number: ");
                    while (!input.hasNextDouble())
                    {
                        System.out.println("This is not a number! Please enter a number.");
                        input.next();
                    }
                    b = input.nextDouble();

                    if ("+".equals(operation)) 
                    {
                        result = a+b;
                    }

                    else if ("-".equals(operation)) 
                    {
                       result = a-b;
                    }

                    else if ("*".equals(operation)) 
                    {
                        result = a*b;
                    }

                    else if ("/".equals(operation)) 
                    {
                        result = a/b;
                    }
                    System.out.println("The result is: " + result);
                    System.out.println("");
                    System.out.println("Would you like to do another calculation? y/n");
                    again = input.nextLine();
                    again = input.nextLine();
                    if (again.equals("y"))
                        {
                        continue;
                        }
                    else if (again.equals("n")) 
                        {
                        break;
                        }
                    else 
                        {
                        
                    }
                }
            
        }
   }
}

    
    

