/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02.tad_arvore_binaria;

/**
 *
 * @author rafaelamoreira
 */
public class TestaArvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(70);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("Percorrendo a árvore em ordem:");
        arvore.emOrdem();

        System.out.println("\nBuscando o valor 40 na árvore:");
        if (arvore.buscar(40)) {
            System.out.println("Valor encontrado!");
        } else {
            System.out.println("Valor não encontrado.");
        }
    }
    
}
