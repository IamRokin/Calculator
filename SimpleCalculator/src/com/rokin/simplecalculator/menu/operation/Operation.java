/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.simplecalculator.menu.operation;

import java.util.Scanner;

/**
 *
 * @author rokin
 */
public class Operation {
    
    public float addition(float firstNumber, float secondNumber)
    {
        return firstNumber + secondNumber;
    }

    
    public float subtraction(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }
    
    
    public float multiplication(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }
    
    
    public float division(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }
    
    
    public double power(double firstNumber, double secondNumber){
        return Math.pow(firstNumber, firstNumber);
    }
    
    
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
    
    
    public double naturalLog(double number) {
        return Math.log(number);
    }
    
    
    public double base10Log(double number) {
        return Math.log10(number);
    }
    
    
    public double sin(double number) {
        return Math.sin(number);
    }
    
    
    public double cos(double number) {
        return Math.cos(number);
    }
    
    
    public double tan(double number) {
        return Math.tan(number);
    }
    
    
    public double cosec(double number) {
        return 1/Math.sin(number);
    }
    
    
    public double sec(double number) {
        return 1/Math.cos(number);
    }
    
    
    public double cot(double number) {
        return 1/Math.tan(number);
    }
    
    
    public void matrixAddition()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the no. of rows and columns");
        int rows = input.nextInt();
        int columns = input.nextInt();
        
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];
        int[][] sum = new int[rows][columns];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.println("Enter the element of matrix A: a[" +i+"]["+j+"]" );
                matrixA[i][j] = input.nextInt();
            }
            
        }
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.println("Enter the element of matrix B: b[" +i+"]["+j+"]" );
                matrixB[i][j] = input.nextInt();
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        
        System.out.println("The sum of matrix A and B is ");
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                
                
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("");
            
        }
        
    
    }

    public void matrixSubtraction() 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the no. of rows and columns");
        int rows = input.nextInt();
        int columns = input.nextInt();
        
        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];
        int[][] sum = new int[rows][columns];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.println("Enter the element of matrix A: a[" +i+"]["+j+"]" );
                matrixA[i][j] = input.nextInt();
            }
            
        }
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.println("Enter the element of matrix B: b[" +i+"]["+j+"]" );
                matrixB[i][j] = input.nextInt();
                sum[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        
        
        System.out.println("The sum of matrix A and B is ");
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                
                
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("");    
        }  
    }

    public void matrixMultiplication() 
    {
        Scanner input = new Scanner(System.in);
        
        int i,j,k;
        
        int sum = 0;
        
        System.out.println("Enter the rows and columns of matrix A");
        int rowsA = input.nextInt();
        int columnsA = input.nextInt();
        int[][] matrixA = new int[rowsA][columnsA];
        
        for(i=0;i<rowsA;i++)
        {
            for(j=0; j<columnsA;j++)
            {
                System.out.println("Enter the element of matrix A: a[" + i + "][" + j + "]");
                matrixA[i][j] = input.nextInt();
            }
        }
        
        
        
        System.out.println("Enter the rows and columns of matrix B");
        int rowsB = input.nextInt();
        int columnsB = input.nextInt();
        int[][] matrixB = new int[rowsB][columnsB];
        
        
        int[][] multipliedMatrix = new int[rowsA][columnsB]; 
        if(columnsA != rowsB)
        {
            System.out.println("These two matrices cannot be multiplied");
        }
        else
        {
            
            for (i = 0; i < rowsB; i++) 
            {
                for (j = 0; j < columnsB; j++) 
                {
                    System.out.println("Enter the element of matrix B: b[" + i + "][" + j + "]");
                    matrixB[i][j] = input.nextInt();
                }
            }
            
            for(i=0;i<rowsA;i++)
            {
                for(j=0;j<columnsB;j++)
                {
                    sum = 0;
                    for(k=0;k<rowsB;k++)
                    {
                        sum = sum + matrixA[i][k] * matrixB[k][j];
                    }
                    multipliedMatrix[i][j] = sum;
                }
            }
        }  
    
        for(i=0;i<rowsA;i++)
        {
            for (j=0;j<columnsB;j++) 
            {
                System.out.print(multipliedMatrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}

   

    

