/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04.tad_jogador;

/**
 *
 * @author rafaelamoreira
 */
public class TestaJogador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JogadorFutebol jogador = new JogadorFutebol("Cristiano Ronaldo", 100, 70, 30);
        jogador.imprime();
        System.out.println("É bom? " + (jogador.ehBom() ? "Sim" : "Não"));
    }

}
