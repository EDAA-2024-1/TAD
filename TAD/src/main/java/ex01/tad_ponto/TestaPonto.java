/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex01.tad_ponto;

/**
 *
 * @author rafaelamoreira
 */
public class TestaPonto {

    public static void main(String[] args) {
        
        Ponto p1 = new Ponto(3, 4);
        Ponto p2 = new Ponto(6, 8);

        double[] coordenadas = p1.pto_acessa();
        System.out.println("Ponto 1: (" + coordenadas[0] + ", " + coordenadas[1] + ")");

        p1.pto_atribui(5, 6);
        coordenadas = p1.pto_acessa();
        System.out.println("Ponto 1 após atribuição: (" + coordenadas[0] + ", " + coordenadas[1] + ")");

        double distancia = p1.pto_distancia(p2);
        System.out.printf("Distância entre Ponto 1 e Ponto 2: %.2f ", distancia);
    
    }
}
