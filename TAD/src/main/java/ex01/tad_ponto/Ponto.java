/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01.tad_ponto;

/**
 *
 * @author rafaelamoreira
 */
public class Ponto {
    private double x, y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Método para acessar as coordenadas do ponto
    public double[] pto_acessa() {
        return new double[]{this.x, this.y};
    }

    // Método para atribuir novos valores às coordenadas do ponto
    public void pto_atribui(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para calcular a distância entre este ponto e outro ponto
    public double pto_distancia(Ponto outro) {
        return Math.sqrt(Math.pow(this.x - outro.x, 2) + Math.pow(this.y - outro.y, 2));
    }

}
