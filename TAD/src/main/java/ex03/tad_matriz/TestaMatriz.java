/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03.tad_matriz;

/**
 *
 * @author rafaelamoreira
 */
public class TestaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matriz matriz = new Matriz(3, 3); // Cria uma matriz 3x3

        // Atribui valores à matriz
        matriz.atribuiValor(0, 0, 1);
        matriz.atribuiValor(0, 1, 2);
        matriz.atribuiValor(0, 2, 3);
        matriz.atribuiValor(1, 0, 4);
        matriz.atribuiValor(1, 1, 5);
        matriz.atribuiValor(1, 2, 6);
        matriz.atribuiValor(2, 0, 7);
        matriz.atribuiValor(2, 1, 8);
        matriz.atribuiValor(2, 2, 9);

        System.out.println("Matriz:");
        matriz.imprimeMatriz();

        int valor = matriz.obtemValor(1, 1);
        System.out.println("Valor na posição (1,1): " + valor);
    }
    
}
