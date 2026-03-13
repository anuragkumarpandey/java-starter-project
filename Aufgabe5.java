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
public class Aufgabe5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String buchstaben=scan.nextLine();
       
        System.out.println(buchstaben.length()<=5? "kurz" :"lang"   );
       
    }
}
