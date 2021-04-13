package Classes;

import Interface.CalcularMetodo;

public class Circulo implements CalcularMetodo {
    private double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String explicarMetodo() {
        return "O calculo do raio é:  PI * raio * raio";
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
