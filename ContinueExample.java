/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdproject;

/**
 *
 * @author ap479
 */
public class ContinueExample {
    public static void main(String[]args){
        int counter = 0;
        for(int num = 1; num<100; num++){
            if(num%5==0){
               continue;
            }
             System.out.println(num + " ");
             counter++;
          
        
        if(counter==4){
            
        
                     System.out.println();
                     counter = 0;
}
    }
}
}
