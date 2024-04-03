/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03.tad_matriz;

/**
 *
 * @author rafaelamoreira
 */
public class Matriz {

    private int[][] dados;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    public void atribuiValor(int linha, int coluna, int valor) {
        if (linha >= 0 && linha < this.linhas && coluna >= 0 && coluna < this.colunas) {
            this.dados[linha][coluna] = valor;
        } else {
            System.out.println("Índice fora dos limites da matriz.");
        }
    }

    public int obtemValor(int linha, int coluna) {
        if (linha >= 0 && linha < this.linhas && coluna >= 0 && coluna < colunas) {
            return this.dados[linha][coluna];
        } else {
            System.out.println("Índice fora dos limites da matriz.");
            return Integer.MIN_VALUE; // erro
        }
    }

    public void imprimeMatriz() {
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                System.out.print(this.dados[i][j] + " ");
            }
            System.out.println();
        }
    }
}
