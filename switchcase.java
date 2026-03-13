/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thirdproject;

import java.util.Scanner;

/**
 *
 * @author ap479
 */
public class switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        switch(x){
            case 1: 
                System.out.println("Sunday");
                break;
  case 2: 
                System.out.println("Monday");
                break;
case 3: 
                System.out.println("Tuesday");
                break;
case 4: 
                System.out.println("Wednesday");
                break;

case 5: 
                System.out.println("Thursday");
                break;
case 6: 
                System.out.println("Friday");
                break;
case 7: 
                System.out.println("Saturday");
                break;
default :
                System.out.println("Ungültige eingaben");
                break;

            
        }
    }
    
}
