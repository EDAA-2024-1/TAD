/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02.tad_arvore_binaria;

/**
 *
 * @author rafaelamoreira
 */
public class ArvoreBinaria {

    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    void inserir(int valor) {
        raiz = inserirRecursivamente(raiz, valor);
    }

    No inserirRecursivamente(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }
        if (valor < raiz.valor) {
            raiz.esquerda = inserirRecursivamente(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = inserirRecursivamente(raiz.direita, valor);
        }
        return raiz;
    }

    boolean buscar(int valor) {
        return buscarRecursivamente(raiz, valor);
    }

    boolean buscarRecursivamente(No raiz, int valor) {
        if (raiz == null) {
            return false;
        }
        if (raiz.valor == valor) {
            return true;
        }
        return valor < raiz.valor ? buscarRecursivamente(raiz.esquerda, valor) : buscarRecursivamente(raiz.direita, valor);
    }

    void emOrdem() {
        emOrdemRecursivamente(raiz);
    }

    void emOrdemRecursivamente(No raiz) {
        if (raiz != null) {
            emOrdemRecursivamente(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            emOrdemRecursivamente(raiz.direita);
        }
    }
}
