/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05.tad_time;

import ex04.tad_jogador.JogadorFutebol;

/**
 *
 * @author rafaelamoreira
 */
public class TesteTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JogadorFutebol[] jogadores = new JogadorFutebol[5];
        jogadores[0] = new JogadorFutebol("Jogador 1", 100, 50, 10);
        jogadores[1] = new JogadorFutebol("Jogador 2", 90, 40, 20);
        jogadores[2] = new JogadorFutebol("Jogador 3", 80, 60, 25);
        jogadores[3] = new JogadorFutebol("Jogador 4", 85, 55, 15);
        jogadores[4] = new JogadorFutebol("Jogador 5", 75, 45, 30);

        TimeFutebol time = new TimeFutebol("Cruzeiro", "Nicolás Larcamón", 30, 10, 5, jogadores);
        time.imprime();
        System.out.println("Pontuação Total: " + time.pontuacao());
    }
    
}
