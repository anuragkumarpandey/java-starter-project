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
public class WeihnachtsBaum {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        for(int i=1;i<=h;i++){
            for(int leer=1;leer<=h-i; leer++){
                System.out.print(" ");        
            }
            int width = 2*i-1;
            for(int hash = 1; hash<=width;hash++){
                
                if(hash == 1 || hash == width){
                 System.out.print("i");
   
                }else{
                System.out.print("#");
            }
          
            }
                        System.out.println();

        }
          //stam oder trunk
          for(int space=1; space<=h-2;space++){
            System.out.print(" ");     
        }
        
   System.out.println("|_|");

  
     
}
}
