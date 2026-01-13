/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pokedex;

/**
 *
 * @author dnct9
 */
public class Pokemon {
    String name;
    int defense;
    int attack;
    int speed;

    public Pokemon(String name, int defense, int attack, int speed) {
        this.name = name;
        this.defense = defense;
        this.attack = attack;
        this.speed = speed;
    }
    
    public void fight() {
        System.out.println("pokemon fighting!");
    }
    public void run(){
        System.out.println("pokemon running!");
    }
    public void sleep(){
        System.out.println("pokemon sleeping!");
    }
   
}
