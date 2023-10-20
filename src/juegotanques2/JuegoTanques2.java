/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegotanques2;

/**
 *
 * @author diego
 */
public class JuegoTanques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Personaje jugador = new Personaje("Jugador", 100, 10);
        Enemigo enemigo1 = new Enemigo("Enemigo 1", 50, 5);
        Enemigo enemigo2 = new Enemigo("Enemigo 2", 50, 5);
        while (jugador.vida > 0 && (enemigo1.vida > 0 || enemigo2.vida > 0)) {
            jugador.disparar();

            if (enemigo1.vida > 0) {
                enemigo1.comportamiento();
                enemigo1.recibirDaño(10);
            }

            if (enemigo2.vida > 0) {
                enemigo2.comportamiento();
                enemigo2.recibirDaño(10);
            }
        }
        if (jugador.vida <= 0) {
            System.out.println("Game Over. Has perdido.");
        } else {
            System.out.println("¡Has ganado! Todos los enemigos han sido destruidos.");
        }
    }
    
}
