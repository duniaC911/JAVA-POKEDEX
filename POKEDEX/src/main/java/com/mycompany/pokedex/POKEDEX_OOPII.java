/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pokedex;

import com.mycompany.pokedex.Pokemon;
import static com.mycompany.myCode.MyCode.askForNumberBetween;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dnct9
 */
public class POKEDEX_OOPII {

public class Pokedex {

    static ArrayList<String> pokedex = new ArrayList<String>();
    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("-----------------------------------");
        System.out.println("-----------P O K E D E X-----------");
        System.out.println("-----------------------------------");
        System.out.println("1. RELLENAR POKEMON AUTO");
        System.out.println("2. AÑADIR POKEMON");
        System.out.println("3. AÑADIR POKEMON POR POSICION");
        System.out.println("4. BORRAR POKEMON");
        System.out.println("5. BORRAR POKEMON POR POSICION");
        System.out.println("6. ENCONTRAR POKEMON");
        System.out.println("7. MOSTRAR LOS POKEMONES");
        System.out.println("8. AÑADIR POSICION PARA EL POKEMON");
        System.out.println("9. CANTIDAD DE POKEMONS");
        System.out.println("10. HACKEAR POKEDEX");
        System.out.println("11. BORRAR POKEDEX");
        System.out.println("0. SALIR");

        return askForNumberBetween(0, 11, "Elige una opcion");
    }

    public static void fillPokedexAuto() {
        pokedex.add("snorlax");
        pokedex.add("venonat");
        pokedex.add("slowbro");
        pokedex.add("mantine");
        pokedex.add("kingdra");
        System.out.println("¡Pokedex rellenada con 5 pokemons!");
    }

    public static void addPokemon() {
        System.out.println("----Ingresa pokemon-----");
        String name = sc.nextLine();
        int defense = sc.nextInt();
        int attack = sc.nextInt();
        int speed = sc.nextInt();
        if (pokedex.contains(name)) {
            System.out.println("El Pokemon ya existe");
        } else {
            pokedex.add(name);
            System.out.println("Pokemon añadido");
        }
        //create object okemon using constructor pokemon class
        Pokemon slowbro = new Pokemon("slowbro", 100 , 100, 100);
        //invocamon el metodo addPokemon pasando el objeto
       
    }
   

    public static void showAllPokemon() {
        if (pokedex.isEmpty()) {
            System.out.println("POKEDEX VACIA.");
            return;
        }
        System.out.println("---- LISTA DE POKEMON ----");
        for (String p : pokedex) {
            System.out.println("- " + p);

        }
    }

    public static void addPokemonAtPosition() {
        System.out.println("---Ingrese una posicion.---");
        int pos = sc.nextInt();
        if (pos < 0 || pos > pokedex.size()) {
            System.out.println("Posicion invalida");
            return;
        }
        System.out.println("---Ingrese el nombre del Pokemon---");
        String name = sc.next();
        if (pokedex.contains(name)) {
            System.out.println("El Pokemon ya existe");
        } else {
            pokedex.add(pos, name);
            System.out.println("Pokemon añadido");
        }

    }

    public static void deletePokemon() {
        System.out.println("---Ingresa el pokemon.---");
        String name = sc.next();
        if (pokedex.remove(name)) {
            System.out.println("POKEMON BORRADO");
        } else {
            System.out.println("Pokemon NO existe");
        }

    }

    public static void deletePokemonAtPositiion() {
        System.out.println("---Ingrese una posicion.---");
        int pos = sc.nextInt();
        if (pos < 0 || pos >= pokedex.size()) {
            System.out.println("Posicion invalida");
        } else {
            System.out.println("Pokemon eliminado");
            pokedex.remove(pos);
        }

    }

    public static void findPokemon() {
        System.out.println("---Ingrese el nombre del pokemon---");
        String name = sc.next();
        int pos = pokedex.indexOf(name);
        if (pos == -1) {
            System.out.println("El pokemon no se encuentra en la pokedex.");
        } else {
            System.out.println("Pokemon encontrado: " + pos + " " + name);
        }
    }

    public static void getPokemonAtPosition() {
        System.out.println("---Ingrese una posicion.---");
        int pos = sc.nextInt();
        if (pos < 0 || pos >= pokedex.size()) {
            System.out.println("OPSS! Posicion invalida.");
        } else {
            String name = pokedex.get(pos);
            System.out.println("El pokemon en la posicion " + pos + " es: " + name);
        }

    }

    public static void countPokemon() {
        if (pokedex.isEmpty()) {
            System.out.println("---La pokedex esta vacia.---");
        } else {
            System.out.println("Hay " + pokedex.size() + " pokemons en la pokedex");
        }
    }

    public static void hackPokedex() {
        while(pokedex.size() < 100){
            pokedex.add("Ditto");
        }
        System.out.println("TU POKEDEX HA SIDO HACKEADA. MUAJAJAJA!");
    }
    
    public static void erasePokedexInfo() {
        System.out.println("-----Eliminando pokedex------");
        System.out.println("[||||||||||||| 98% ||||||||||||| ]");
        pokedex.clear();
        System.out.println("POKEDEX ELIMINADA. AHORA ESTA VACIA!!");
    }
    
    public static void main(String[] args) {
        int opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    fillPokedexAuto();
                    break;
                case 2:
                    addPokemon();
                    break;
                case 3:
                    addPokemonAtPosition();
                    break;
                case 4:
                    deletePokemon();
                    break;
                case 5:
                    deletePokemonAtPositiion();
                    break;
                case 6:
                    findPokemon();
                    break;
                case 7:
                    showAllPokemon();
                    break;
                case 8:
                    getPokemonAtPosition();
                    break;
                case 9:
                    countPokemon();
                    break;
                case 10:
                    hackPokedex();
                    break;
                case 11:
                    erasePokedexInfo();
                    break;
                case 0:
                    System.out.println("---Saliendo---");
                    break;

            }

        } while (opc != 0);

    }

    

}

}
