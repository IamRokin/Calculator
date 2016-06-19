/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.simplecalculator.menu.operation;

import com.rokin.simplecalculator.menu.MenuClass;
import java.util.Scanner;

/**
 *
 * @author rokin
 */
public class CalculationFactory {

    public void calculation(int choice) 
    {
        Scanner input = new Scanner(System.in);
        MenuClass menu = new MenuClass();
        Operation operation = new Operation();
        switch (choice)
        {
            case 1:
                menu.simpleCalulationMenu();

                System.out.println("Enter your choice");
                int operationChoice = input.nextInt();

                System.out.println("Enter first number");
                float firstNumber = input.nextFloat();

                System.out.println("Enter second number");
                float secondNumber = input.nextFloat();

                switch (operationChoice) 
                {
                    case 1:
                        System.out.println("Result : " + operation.addition(firstNumber, secondNumber));
                        break;

                    case 2:
                        System.out.println("Result : " + operation.subtraction(firstNumber, secondNumber));
                        break;

                    case 3:
                        System.out.println("Result : " + operation.multiplication(firstNumber, secondNumber));
                        break;

                    case 4:
                        System.out.println("Result : " + operation.division(firstNumber, secondNumber));
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;

            case 2:
                menu.complexCalculationMenu();
                switch (input.nextInt())
                {
                    case 1:
                        System.out.println("Enter a and b");
                        System.out.println("Result: " + operation.power(input.nextDouble(), input.nextDouble()));
                        break;

                    case 2:
                        System.out.println("Enter a number");
                        System.out.println("Result: " + operation.squareRoot(input.nextDouble()));
                        break;

                    case 3:
                        System.out.println("Enter a number");
                        System.out.println("Result: " + operation.naturalLog(input.nextDouble()));
                        break;

                    case 4:
                        System.out.println("Enter a number");
                        System.out.println("Result: " + operation.base10Log(input.nextDouble()));
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;

            case 3:
                menu.trigonometricCalculationMenu();
                operationChoice = input.nextInt();
                System.out.println("Enter the angle in radian");
                double degree = input.nextDouble();

                switch (operationChoice) 
                {
                    case 1:
                        System.out.println("Result: " + operation.sin(degree));
                        break;

                    case 2:
                        System.out.println("Result: " + operation.cos(degree));
                        break;

                    case 3:
                        System.out.println("Result: " + operation.tan(degree));
                        break;

                    case 4:
                        System.out.println("Result: " + operation.cosec(degree));
                        break;

                    case 5:
                        System.out.println("Result: " + operation.sec(degree));
                        break;

                    case 6:
                        System.out.println("Result: " + operation.cot(degree));
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }

                break;

            case 4:
                menu.matrixOperation();
                operationChoice = input.nextInt();
                switch (operationChoice)
                {
                    case 1:
                        operation.matrixAddition();
                        break;

                    case 2:
                        operation.matrixSubtraction();
                        break;

                    case 3:
                        operation.matrixMultiplication();
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("Go Again? (Y/N)");
        if (input.next().equalsIgnoreCase("n")) {
            System.exit(0);
        }

        System.out.println("");

    }
}
