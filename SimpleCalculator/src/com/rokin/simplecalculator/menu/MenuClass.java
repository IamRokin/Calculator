/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.simplecalculator.menu;

import java.util.Scanner;

/**
 *
 * @author rokin
 */
public class MenuClass {
    
    public void menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Which operation do you want to perform?");
        System.out.println("1. Simple Calculation");
        System.out.println("2. Complex Calculation");
        System.out.println("3. Trigonometric Operation");
        System.out.println("4. Matrix Operation");
    }
    
    
    public void simpleCalulationMenu()
    {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }
    
    
    public void complexCalculationMenu()
    {
        System.out.println("1. a Power b");
        System.out.println("2. Square root");
        System.out.println("3. Natural logarithm");
        System.out.println("4. Base 10 logarithm");
    }
    
    
    public void trigonometricCalculationMenu()
    {
        System.out.println("1. sin");
        System.out.println("2. cos");
        System.out.println("3. tan");
        System.out.println("4. cosec");
        System.out.println("5. sec");
        System.out.println("6. cot");
    }
    
    public void matrixOperation()
    {
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Subtraction");
        System.out.println("3. Matrix Multiplication");
    }
    
}
