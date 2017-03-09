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
        System.out.println("1st number: ");
        Scanner number1 = new Scanner(System.in);
        int a = number1.nextInt();
        
        System.out.println("1st number: ");
        Scanner number2 = new Scanner(System.in);
        int b = number2.nextInt();
        
        int result = a+b;
        
        System.out.println("The summ is: " + result);
    }
    
}
