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
public class MethodExercise {
    public static void main(String[]args){
        System.out.println("geben Sie bitte drei zahlen aus");

        Scanner scan = new Scanner(System.in);
        int x =scan.nextInt();
        int y =scan.nextInt();
        int z =scan.nextInt();
       
        //method call
        durschnitt(x,y,z);
        quadwurt(x,y,z);
        zweiten(x,y,z);
        drei(x,y,z);
        
        
    }
        //Duchschnitt von drei Zahlen
        public static void durschnitt(int x ,int y,int z){
            double durschnitt = (x+y+z)/3;
                  System.out.println("Durschnitt=" + durschnitt);

        }
        public static void quadwurt(int x,int y,int z){
            double quadwurt = Math.sqrt(z);
                   System.out.println("quadwurtzahlen= " + quadwurt);
                   }
//Quadwurtzahlen der zweiten zahl

public static void zweiten(int x,int y,int z){
    double zweiten = Math.sqrt(y);
    System.out.println("Zweiten quadratwurzel=" + zweiten);
    

        }
public static void drei(int x, int y, int z){
                double durschnitt = (x+y+z)/3;

    double quadratDrei = Math.sqrt(durschnitt);
    System.out.println(" Quadratwurzel des Durchschnitts der drei Zahlen" + quadratDrei);
}
    }

