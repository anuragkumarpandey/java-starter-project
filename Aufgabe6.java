/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bedinteanweisung;

import java.util.Scanner;

/**
 *
 * @author ap479
 */
public class Aufgabe6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kleinFliesen=scan.nextInt();
        int großFliesen=scan.nextInt();
        int länge=scan.nextInt();
        //imp
       int großUsed=Math.min(großFliesen,länge/5);
       
       int übrig=länge-(großUsed*5);
       
       if(übrig<=kleinFliesen){
           System.out.println("möglich");
       }
       else{
           System.out.println("nicht möglich");
       }
    }
}
