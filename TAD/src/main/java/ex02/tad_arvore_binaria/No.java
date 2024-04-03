/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02.tad_arvore_binaria;

/**
 *
 * @author rafaelamoreira
 */
public class No {

    int valor;
    No esquerda, direita;

    public No(int item) {
        valor = item;
        esquerda = direita = null;
    }

}
