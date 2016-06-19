/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.simplecalculator;

/**
 *
 * @author rokin
 */
import com.rokin.simplecalculator.menu.MenuClass;
import com.rokin.simplecalculator.menu.operation.CalculationFactory;
import java.util.Scanner;

public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        MenuClass menu = new MenuClass();
        CalculationFactory calculationFactory = new CalculationFactory();
        
        Scanner input = new Scanner(System.in);

        while (true)
        {
            menu.menu();
            System.out.println("Enter your choice [1/2/3/4]");
            calculationFactory.calculation(input.nextInt());
        }

    }
}
