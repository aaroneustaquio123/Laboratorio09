/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegotanques2;

/**
 *
 * @author diego
 */
public class Enemigo extends Personaje {
   
    public Enemigo(String nombre,int vida, int municion){
        super(nombre, vida, municion);
        
    }
     public void comportamiento() {
        System.out.println(nombre + " se mueve y ataca al jugador.");
    }
}
