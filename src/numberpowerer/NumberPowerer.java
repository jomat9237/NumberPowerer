/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpowerer;
    import java.util.Scanner;
/**
 *
 * @author jtmat
 */
public class NumberPowerer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        int option;
        int number;
        int numberDisplayed;
        int power;
        System.out.println("1. Square a number");
        System.out.println("2. Cube a number");
        System.out.println("3. Any number to the power of any number");
        System.out.println("4. Exit");
        do{
            option = keyedInput.nextInt();
            if(option == 1){
                System.out.println("Enter number you would like to square");
                number = keyedInput.nextInt();
                for(int i = 0; i<1; i=i+1){
                    numberDisplayed = number*number;       
                    System.out.println(numberDisplayed);
                }
            }
            else if(option == 2){
                System.out.println("Enter number you would like to cube.");
                number= keyedInput.nextInt();
                numberDisplayed = number;
                //numberDisplayed = keyedInput.nextInt();
                for(int i = 1; i<3; i=i+1){
                numberDisplayed = numberDisplayed*number;              
                }
                System.out.println(numberDisplayed);
            }
            else if(option == 3){
                System.out.println("Enter Number");
                number = keyedInput.nextInt();
                numberDisplayed = number;
                System.out.println("Enter to what power");
                power = keyedInput.nextInt();
                for(int i = 1;i < power; i = i + 1){
                    numberDisplayed = number * numberDisplayed;                    
                }
                System.out.println(numberDisplayed);
                
            }
            else if(option == 4){
                System.out.println("Program done");
            }else{
                System.out.println("Not a valid input");
                
            }
            
        }while(option != 4);
    }
    
}