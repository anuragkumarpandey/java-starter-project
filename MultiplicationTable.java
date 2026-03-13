/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdproject;

/**
 *
 * @author ap479
 */
public class MultiplicationTable {
    public static void main (String[]args){
        int i;
                int j;
       for(i=1; i<=10; i++){
            for(j=1;j<=10; j++){
    System.out.println(i + "x" + j +"=" + i*j );
    
            }
        }
       System.out.println();
       //kein doppelt
       for(i = 1;i<=10;i++){
            for(j=1;j<=10; j++){
    System.out.println(i + "x" + j +"=" + i*j);
       }
    }
}
}