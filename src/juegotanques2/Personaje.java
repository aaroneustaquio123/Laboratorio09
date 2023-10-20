/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegotanques2;

/**
 *
 * @author diego
 */
public class Personaje {
    String nombre;
    protected int vida;
    protected int municion;
     public Personaje(String nombre, int vida, int municion) {
        this.nombre = nombre;
        this.vida = vida;
        this.municion = municion;
    }
     public void disparar() {
        if (municion > 0) {
            System.out.println(nombre + " dispara un proyectil.");
            municion--;
        } else {
            System.out.println(nombre + " se ha quedado sin munición.");
        }
     } 
      public void recibirDaño(int cantidad) {
        vida -= cantidad;
        if (vida <= 0) {
            System.out.println(nombre + " ha sido destruido.");
        } else {
            System.out.println(nombre + " ha recibido " + cantidad + " puntos de daño. Vida restante: " + vida);
        }
    }
}
