/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bedinteanweisung;

import java.util.Scanner;

/**
 *
 * @author ap479
 */
public class BedinteAnweisung3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Ihr Geschwindigkeit war:");
        int speed = scan.nextInt();

        if (speed <= 60) {
            System.out.println("Weiterfahren,weiterfahren!");
        }    
            
        else {
            //speed>60
            if (speed<= 65 ) {
            System.out.println("Ist Ihr geburtstag? (true/false)");
                    boolean birthday=scan.nextBoolean();

                 
            if(birthday){
            System.out.println("Dann will ich mal nicht so sein");
            }   
         else {     
            System.out.println("das wird teuer");
        }
        }
            else {
                //speed>65
                System.out.println("das wird teuer!");
                }
    }
    }
    
}
  