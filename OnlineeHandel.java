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
public class OnlineeHandel {
    public static void main(String[]args){
          Scanner scan = new Scanner(System.in);
       int  choice;
        double total=0.0;
        System.out.println("Preisen:");
            System.out.println(" 1 =Jeans: 29,90 €\n 2=T-Shirts: 13,50 €\n3=Schuhe: 34,99 €\n 4=Jacken: 44,99 €\n 0= finish");

      do{
     System.out.println("Your choice");
      choice = scan.nextInt();
      if (choice == 1){
          total = total + 29.90;
      }  else  if (choice == 2){
          total = total + 13.50;
      } else if (choice == 3){
          total = total + 34.99;
      }  else if (choice == 4){
          total = total + 44.99;
      } else if (choice != 0){
            System.out.println("Invalid choice!");

          }
      
           }  while(choice != 0);
            System.out.println("total " + total +"euro");
    }
           
}
           