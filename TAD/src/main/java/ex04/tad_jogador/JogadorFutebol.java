/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04.tad_jogador;

/**
 *
 * @author rafaelamoreira
 */
public class JogadorFutebol {

    private String nome;
    private int jogos;
    private int gols;
    private int assistencias;

    public JogadorFutebol(String nome, int jogos, int gols, int assistencias) {
        this.nome = nome;
        this.jogos = jogos;
        this.gols = gols;
        this.assistencias = assistencias;
    }

    public void atribui(String nome, int jogos, int gols, int assistencias) {
        this.nome = nome;
        this.jogos = jogos;
        this.gols = gols;
        this.assistencias = assistencias;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Jogos: " + jogos);
        System.out.println("Gols: " + gols);
        System.out.println("Assistências: " + assistencias);
    }

    public boolean ehBom() {
        return ((double) gols / jogos > 0.7) || ((double) assistencias / jogos > 0.7);
    }
}
