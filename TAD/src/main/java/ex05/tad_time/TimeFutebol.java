/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05.tad_time;

import ex04.tad_jogador.JogadorFutebol;

/**
 *
 * @author rafaelamoreira
 */
public class TimeFutebol {

    private String nome;
    private String treinador;
    private int vitorias;
    private int empates;
    private int derrotas;
    private JogadorFutebol[] jogadores;

    public TimeFutebol(String nome, String treinador, int vitorias, int empates, int derrotas, JogadorFutebol[] jogadores) {
        this.nome = nome;
        this.treinador = treinador;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.jogadores = jogadores;
    }

    public void atribui(String nome, String treinador, int vitorias, int empates, int derrotas, JogadorFutebol[] jogadores) {
        this.nome = nome;
        this.treinador = treinador;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Nome do Time: " + nome);
        System.out.println("Treinador: " + treinador);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Jogadores:");
        for (JogadorFutebol jogador : jogadores) {
            jogador.imprime();
            System.out.println("--------------------");
        }
    }

    public int pontuacao() {
        return vitorias * 3 + empates;
    }
}
