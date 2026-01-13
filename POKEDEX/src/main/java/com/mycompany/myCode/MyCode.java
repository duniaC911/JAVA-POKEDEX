/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myCode;

import java.util.Scanner;

/**
 *
 * @author Dun Cat
 */
public class MyCode {
    public static int askForNumberBetween(int min, int max, String msg){
        Scanner sc = new Scanner (System.in);
        int opc;
        do{
            System.out.println(msg);
            opc = sc.nextInt();
        }while(opc < min || opc > max);
        return opc;
    }
    
    public static String askForName(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        return name;   
    }
    
    public static int askForNumber(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
}
