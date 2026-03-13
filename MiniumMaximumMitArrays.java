/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thirdproject;

/**
 *
 * @author ap479
 */
public class MiniumMaximumMitArrays {
    public static void main(String[]args){
     int[] numbers = {5,10,2,6,8,4,13};
     double sum = 0;
     int minWert= numbers[0];
     int minPosition= 0;
     int maxWert= numbers[0];
     int maxPosition= 0;
     for( int i = 0; i<numbers.length;i++){
         sum = sum + numbers[i];
         if(numbers[i] < minWert){
             minWert = numbers[i];
             minPosition = i;
         }if(numbers[i] > maxWert){
             maxWert = numbers[i];
             maxPosition = i;
         }
         
     }
     double durschnitt = sum/numbers.length;
     System.out.println(durschnitt);
     System.out.println(minWert);
     System.out.println(minPosition);
     System.out.println(maxWert);
     System.out.println(maxPosition);
     
    }
}
