/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdproject;

import java.util.Scanner;

/**
 *
 * @author ap479
 */
public class TachenRechner {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("geben sie zwei zahlen ein");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Wählen Sie: +,-,*,/,% aus");
        char operator = scan.next().charAt(0);
       double ergebnis = 0;
        switch(operator){
            case '+':  ergebnis= a + b;
                     break;
            case '-' : ergebnis = a - b;
                         break;
            case '*' : ergebnis = a * b;
                       break;
            case '/' : ergebnis = a / b;
                      break;
            case '%':  ergebnis = a % b;
                      break;
            default: 
                System.out.println("falsche eingabe");
               
        }
       System.out.println("Ergebnis is " + ergebnis);
    }
}
